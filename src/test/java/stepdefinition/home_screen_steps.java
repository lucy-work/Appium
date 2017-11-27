package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import stepdefinition.support.BasePage;
import stepdefinition.support.androidSetUp;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class home_screen_steps extends BasePage {
    @Then("^(Left|Right) Unit picker value should be (.+)$")
    public void leftUnitPickerValueShouldBeFoot(String leftORright, String anyText) {
        String actual = null;
        List<AndroidElement> actual_text = (ArrayList<AndroidElement>) androidSetUp.getDriver().findElements(By.id("select_unit_spinner"));
//        ArrayList<AndroidElement> actual_text;
//        actual_text = (ArrayList<AndroidElement>) androidSetUp.getDriver().findElements(By.id("select_unit_spinner"));
        switch (leftORright) {
            case "Left":
                actual = actual_text.get(0).getText();
                break;
            case "Right":
                actual = actual_text.get(1).getText();
                break;
        }
            Assert.assertEquals(actual, anyText);
    }


    @Then("^Show All button should be (enable|disable)$")
    public void showAllButtonShouldBeEnable(String state) {
        boolean result = false;
        result = androidSetUp.getDriver().findElement(By.id("btn_show_all")).isEnabled();
        switch (state) {
            case "enable":
                Assert.assertEquals(result, true);
                break;
            case "disable":
                Assert.assertEquals(result, false);
                break;
        }
    }

    @When("^I press on Clear button$")
    public void iPressOnClearButton() {
        System.out.println("I press on Clear button");
    }

    @When("^I type \"([^\"]*)\" on application keyboard$")
    public void iTypeToTargetTextField(String target) {
        String[] digits = target.split("");
        for (String digit : digits ) {
            androidSetUp.getDriver().findElement(By.id("keypad")).findElement(By.xpath(String.format("//android.widget.Button[@text= '%s']", digit))).click();
        }
        //androidSetUp.getDriver().findElement(By.id("keypad")).findElement(By.xpath(String.format("//android.widget.Button[@text= '%s']", target))).click();
    }

    @Then("^I should see result as \"([^\"]*)\"$")
    public void shouldSeeResultAs(String result) {
        Assert.assertEquals(androidSetUp.getDriver().findElement(By.id("target_value")).getText(), result);
//        AndroidElement target = (AndroidElement) androidSetUp.getDriver().findElement(By.id("target_value"));
//        System.out.println(target.getText() + "         " + result);
//        Assert.assertEquals(target.getText(), result);
    }

    @When("^I press star icon$")
    public void iPressStarIcon() {
        androidSetUp.getDriver().findElement(By.id("Add to favorites")).click();
    }

    @And("^I press on Favorite Conversions button$")
    public void iPressOnFavoriteConversionsButton() {
        androidSetUp.getDriver().findElement(By.xpath("//*[@text='Favorite conversions']")).click();
    }


    @Then("^I verify \"([^\"]*)\" added to the Favorite Conversation$")
    public void isAddedToTheFavoriteConversation(String text) {
        Assert.assertEquals(androidSetUp.getDriver().findElement(By.id("favorites_item_hint")).getText(), text);
    }


    @When("^I press on (Search icon|Switch button)$")
    public void iPressOnSearchIcon(String button) {
        switch(button) {
            case "Search icon":
                androidSetUp.getDriver().findElement(By.id("action_search")).click();
                break;
            case "Switch button":
                androidSetUp.getDriver().findElement(By.id("img_switch")).click();
                break;
        }

    }

    @Then("^I type \"([^\"]*)\" in search field$")
    public void iTypeInSearchField(String text) throws IOException {
       androidSetUp.getDriver().findElement(By.id("search_src_text")).sendKeys(text);
    }

    @And("^I press return button on soft keyboard$")
    public void iPressReturnButtonOnSoftKeyboard() throws InterruptedException {
        androidSetUp.getDriver().tap(1, 1340, 2450, 1);
    }

    @Then("^I see the \"([^\"]*)\" as a current unit conversion$")
    public void iSeeTheAsACurrentUnitConversion(String text) {
        androidSetUp.getDriver().findElement(By.id("action_bar_container")).findElement(By.xpath(String.format("//android.widget.TextView[@text= '%s']", text)));
    }

    @Then("^I select \"([^\"]*)\" from (right|left) unit picker$")
    public void iSelectFromLeftUnitPicker(String text, String picker) {
        List<AndroidElement> pickers = (ArrayList<AndroidElement>) androidSetUp.getDriver().findElements(By.id("select_unit_spinner"));
        switch(picker) {
            case "left":
                selectFromList(pickers, 0, text);
                break;
            case "right":
                selectFromList(pickers, 1, text);
                break;
        }
    }

    @Then("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String value)  {
        Assert.assertEquals(androidSetUp.getDriver().findElement(By.id("text_info_history")).getText(), value);
    }

    @Then("^I verify that (\\d+)(?:st|nd|rd|h)? result in history list is \"([^\"]*)\"$")
    public void iVerifyThatStResultInHistoryListIs(int index, String text) {
        List<AndroidElement> list = androidSetUp.getDriver().findElements(By.id("history_single_line"));
        Assert.assertEquals(list.get(index - 1).findElement(By.id("history_item_hint")).getText(), text);
    }

    @And("^I press delete from history at (\\d+)(?:st|nd|rd|h)? row$")
    public void iPressDeleteFromHistoryAtStRow(int index)  {
        List<AndroidElement> list = androidSetUp.getDriver().findElements(By.id("history_single_line"));
        list.get(index - 1).findElement(By.id("deleteIcon")).click();
    }

}
