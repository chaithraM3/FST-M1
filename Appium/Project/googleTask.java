package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

import static javax.swing.UIManager.get;
import static jdk.internal.org.jline.utils.Colors.s;

public class googleTask {
    //Declaration drivers
    AndroidDriver driver;
    WebDriver wait;
    //
    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UIAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();
        //server URL
        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");

        //driver initialisation
        driver = new AndroidDriver(serverURL, options);
    }
    @Test
    public void addTest() {
        //find element no 8
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        //plus button
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Tasks");
        //find element no 1
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

        // Find the result
           // String data = driver.findElements(AppiumBy.id("My Tasks")).toString().toString();
            //Assert.assertEquals(data, "Complete Activity with Google Tasks");
        }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}

