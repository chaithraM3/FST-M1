package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class activity1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
            // Setup the Firefox driver(GeckoDriver)
            WebDriverManager.firefoxdriver().setup();

            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            // Open the browser
            driver.get("https://alchemy.hguy.co/lms");
            Thread.sleep(2000);
            //actual title
            String actualtitle= driver.getTitle();
            String expectedtitle="Alchemy LMS – An LMS Application";
            Assert.assertEquals(actualtitle,expectedtitle);
             System.out.println(driver.getTitle());
             Thread.sleep(5000);
            driver.quit();
        }
    }