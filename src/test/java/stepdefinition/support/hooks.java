package stepdefinition.support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by liudmylaiterman on 11/13/17.
 */
public class hooks extends androidSetUp {

    @Before
    public void setUp() throws Exception{
            prepareAndroidForAppium();
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        Thread.sleep(1000);

        if (scenario.isFailed())
            {
                attachScreenshot();
//                File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(screenShotFile, new File("target/allure-results/" + "name" + ".png"));
            }
        driver.quit();
    }

    @Attachment(type = "image/png")
    public static byte[] attachScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


//    @Attachment()
//    private void createAttachment() throws IOException {
//        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenShotFile, new File("target/allure-results/" + "name" + ".png"));
//    }

}
