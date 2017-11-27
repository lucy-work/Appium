package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import stepdefinition.support.androidSetUp;

/**
 * Created by liudmylaiterman on 11/15/17.
 */
public class custom_conversation_steps {
    @And("^I press on Create your first conversion button$")
    public void iPressOnCreateYourFirstConversionButton() {
        androidSetUp.getDriver().findElement(By.id("btn_new_custom_conversion")).click();
    }

    @And("^I type \"([^\"]*)\" as a custome converion name$")
    public void iTypeAsACustomeConverionName(String text) {
        androidSetUp.getDriver().findElement(By.id("edit_custom_conversion_category_name")).sendKeys(text);
    }

    @When("^I press on New unit button$")
    public void iPressOnNewUnitButton() {
        androidSetUp.getDriver().findElement(By.id("btn_new_custom_unit")).click();
    }

    @Then("^I type \"([^\"]*)\" as a Unit name$")
    public void iTypeAsAUnitName(String text) {
        androidSetUp.getDriver().findElement(By.id("edit_custom_conversion_unit_dtls_name")).sendKeys(text);
    }

    @Then("^I type \"([^\"]*)\" as a unit symbol$")
    public void iTypeAsAUnitSymbol(String text) {
        androidSetUp.getDriver().findElement(By.id("edit_custom_conversion_unit_dtls_symbol")).sendKeys(text);
    }

    @Then("^I type \"([^\"]*)\" as a unit value$")
    public void iTypeAsAUnitValue(String text) {
        androidSetUp.getDriver().findElement(By.id("edit_custom_conversion_unit_dtls_value")).sendKeys(text);
    }

    @Then("^I press submit checkmark on Custom conversion screen$")
    public void iPressSubmitCheckmarkOnCustomConversionScreen() {
        androidSetUp.getDriver().findElement(By.id("action_confirm_custom_unit")).click();
    }

    @When("^I press on Ok button on the custom confirm screen$")
    public void iPressOnOkButtonOnTheCustomConfirmScreen() {
        androidSetUp.getDriver().findElement(By.id("btn_custom_conversion_details_ok")).click();
    }

    @Then("^I verify \"([^\"]*)\" added to the Custom Conversation$")
    public void iVerifyAddedToTheCustomConversation(String text) {
        androidSetUp.getDriver().findElement(By.xpath(String.format("//*[@text= '%s']", text)));
    }
}
