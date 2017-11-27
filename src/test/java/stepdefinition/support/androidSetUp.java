package stepdefinition.support;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by liudmylaiterman on 11/14/17.
 */
public class androidSetUp {
    protected static AndroidDriver driver = null;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "3.0.0");
        capabilities.setCapability("platformName", "Android");
        //capabilities.setCapability("platformVersion", "5.0");
        capabilities.setCapability("deviceName", "Anyname");
        capabilities.setCapability("app", "/Users/liudmylaiterman/Documents/android_tests/app/PreciseUnitConversion.apk");

        //run it on command line: adb shell dumpsys window windows | grep -E 'mCurrentFocus|mFocusedApp'
        //the first part will be a "appPackage"
        capabilities.setCapability("appPackage", "com.ba.universalconverter");
        //the part after the last dot will be the "appActivity"
        capabilities.setCapability("appActivity", "MainConverterActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

    }

    public static AndroidDriver getDriver() {
        return driver;
    }

}

