package browser;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest {
    @Test
    void openBrowserWithDefaultMode() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.vn/?hl=vi");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }

    @Test
    void openBrowserWithHeadlessMode() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com.vn/?hl=vi");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }


}
