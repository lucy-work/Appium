package stepdefinition.support;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

/**
 * Created by liudmylaiterman on 11/22/17.
 */
public class BasePage {

    public void selectFromList(List<AndroidElement> list, int i, String text) {
        list.get(i).click();
        androidSetUp.getDriver().findElement(MobileBy.AndroidUIAutomator(String.format("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"%s\"));", text))).click();

    }
}
