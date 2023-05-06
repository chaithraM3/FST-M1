package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class activity7 {
    public static void main (String args[]) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        //open the browser
        driver.navigate().to("https://alchemy.hguy.co/lms");
        //find the link text
        WebElement m = driver.findElement(By.linkText("All Courses"));
        m.click();
        List<WebElement> allcourse = driver.findElements(By.xpath("//div[@class='caption']"));
        //call the for loop and get the size of the element
       for (int i=0; i < allcourse.size() ; i++) {
           //read the data and print it
           String data = allcourse.get(i).getText();
           System.out.println("text is:" + data);
             int count=allcourse.size();
           System.out.println("no of contents:" + count);
       }
           //wait
           Thread.sleep(2000);
           //close the browser
           driver.quit();
       }

        }



