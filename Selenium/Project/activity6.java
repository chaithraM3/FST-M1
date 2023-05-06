package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class activity6 {

    public static void main (String args[]) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(1);
        Actions builder = new Actions(driver);
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
        //find the link text
        WebElement m =driver.findElement(By.linkText("My Account"));
        String PlinkText = m.getText();
        //click on it
        m.click();
        //compare the text

        String compare = "My Account";
        Assert.assertEquals(PlinkText,compare);
        System.out.println(" title: " + PlinkText);
        //click on login
        driver.findElement(By.partialLinkText("Login")).click();
        //Find the username field
        driver.findElement(By.id("user_login")).sendKeys("root");
    //Find the password field
       driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
         String actualurl=driver.getCurrentUrl();
        String ExpectedURL="https://alchemy.hguy.co/lms/my-account/";
        Assert.assertEquals(actualurl,ExpectedURL);
        System.out.println(" URL: " + actualurl);
        Thread.sleep(2000);
        //close the browser
        driver.quit();

    }
}