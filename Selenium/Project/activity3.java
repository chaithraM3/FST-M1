package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class activity3 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver=new FirefoxDriver();
        Actions builder = new Actions(driver);

        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
        Thread.sleep(2000);
         // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //get the title of firstbox
        String firstbox = driver.findElement(By.xpath("//h3[text()=' Actionable Training ']")).getText();
        System.out.println(firstbox);
        //Expected title
        String Etitle="Actionable Training";
        //compare the title
        Assert.assertEquals(firstbox,Etitle);
        //Print the title
        //System.out.println(" title: " + Etitle);
        Thread.sleep(2000);
        //close the browser
        driver.quit();

    }
}