package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class activity2 {
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
    public void pageurl() {
       // driver UR

    }

}
