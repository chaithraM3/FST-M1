package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class activity1 {
    //Declaration drivers
    AndroidDriver driver;
    WebDriver wait;
    //
    @BeforeClass
    public void setup() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UIAutomator2");
        options.setAppPackage("com.android.calculator2");
        options.setAppActivity(".Calculator");
        options.noReset();
        //server URL
        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");

        //driver initialisation
        driver = new AndroidDriver(serverURL, options);
    }

        @Test
        public void addTest() {
        //find element no 5
        driver.findElement(AppiumBy.id("digit_5")).click();
        //plus button
        driver.findElement(AppiumBy.id("op_mul")).click();
        //find element no 8
        driver.findElement(AppiumBy.id("digit_8")).click();
        //find element equals
          driver.findElement(AppiumBy.id("eq")).click();

            // Find the result
            String result = driver.findElement(AppiumBy.id("result")).getText();
            // Assertion
            Assert.assertEquals(result, "40");
        }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}