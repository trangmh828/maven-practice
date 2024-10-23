package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest {
    @Test
    void ableToSelectACheckbox() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
//        WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes input:nth-child(3)"));
//        WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes input:nth-of-type(2)"));
//        WebElement checkbox2 = driver.findElement(By.cssSelector("//form[@id='checkboxes']/input"));

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }
//        checkbox2.click();

        Assert.assertTrue(checkbox1.isSelected());
//        Assert.assertFalse(checkbox2.isSelected());
    }

    @Test
    void ableToUnselectACheckbox() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes input:nth-of-type(2)"));

        if (checkbox2.isSelected()) {
            checkbox2.click();
        }

        Assert.assertFalse(checkbox2.isSelected());
    }
}
