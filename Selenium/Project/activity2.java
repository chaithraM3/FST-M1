package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class activity2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        // Open the browser
        driver.get("https://alchemy.hguy.co/lms");
        Thread.sleep(2000);
        //find the element
        WebElement button = driver.findElement(By.className("uagb-ifb-title"));
        //get the title name
        String message = driver.findElement(By.className("uagb-ifb-title")).getText();
        String expectedtitle="Learn from Industry Experts";
        //compare the title
        Assert.assertEquals(message,expectedtitle);
        //Print the title
        System.out.println("Current title: " + message);
        Thread.sleep(2000);
        //close the browser
        driver.quit();

    }
}


