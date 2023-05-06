package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class activity5 {
    public static void main (String args[]) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
        //find the link text
        WebElement element =driver.findElement(By.linkText("My Account"));
        //get the title
        String PlinkText = element.getText();
        //click on it
        element.click();
        String compare = "My Account";
        Assert.assertEquals(PlinkText,compare);
        System.out.println(" title: " + PlinkText);
        Thread.sleep(2000);
        driver.quit();
    }
    }
