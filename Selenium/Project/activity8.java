package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity8 {
    public static void main(String args[]) throws InterruptedException{
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(1);
        Actions builder = new Actions(driver);
        //open the browser
        driver.navigate().to("https://alchemy.hguy.co/lms");
        //click on contact button
        driver.findElement(By.linkText("Contact")).click();
        //Scroll down the webpage by 4500 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0,900)");
        //wait
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        //find  fullname
        WebElement Fullname= driver.findElement(By.id("wpforms-8-field_0"));
        //find email
        WebElement email= driver.findElement(By.id("wpforms-8-field_1"));
        //find subject
        WebElement subject= driver.findElement(By.id("wpforms-8-field_3"));
        //find the comment box
        WebElement comment= driver.findElement(By.id("wpforms-8-field_2"));
        //send inputs
        Fullname.sendKeys("chaithra mallesha");
        email.sendKeys("chaithra.sm28@gmail.com");
        subject.sendKeys("java");
        comment.sendKeys("i am the beginner for java");
        //
        WebElement SMSG=driver.findElement(By.id("wpforms-submit-8"));
                SMSG.click();
        WebElement msg = driver.findElement(By.id("wpforms-confirmation-8"));
        System.out.println(msg.getText());
        Thread.sleep(2000);
        driver.quit();

    }
}
