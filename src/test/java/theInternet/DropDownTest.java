package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest {
    @Test
    void tc03() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");

//        Assert.assertTrue(driver.findElement(By.cssSelector("#dropdown option[value='1']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='dropdown']/option[@value='1']")).isSelected());
        driver.quit();

    }

    @Test
    void ableSelectMultipleOptions() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://output.jsbin.com/osebed/2");

        Select select = new Select(driver.findElement(By.id("fruits")));
        Assert.assertTrue(select.isMultiple());

        select.selectByVisibleText("Banana");
        select.selectByVisibleText("Grape");
        select.selectByVisibleText("Orange");

        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='banana']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='orange']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='grape']")).isSelected());

        // deselect banana
        select.deselectByVisibleText("Banana");

        Assert.assertFalse(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='banana']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='orange']")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='grape']")).isSelected());

        // deselect all
        select.deselectAll();

        Assert.assertFalse(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='banana']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='apple']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='orange']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//select[@id='fruits']/option[@value='grape']")).isSelected());




    }
}
