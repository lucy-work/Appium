package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import stepdefinition.support.androidSetUp;

/**
 * Created by liudmylaiterman on 11/10/17.
 */
public class main_menu_steps {

    @Given("^I land on the home screen$")
    public void iLandOnTheHomeScreen() {
        androidSetUp.getDriver().findElement(By.id("action_search"));
        androidSetUp.getDriver().findElement(By.id("action_add_favorites"));
    }

    @When("^I press on (menu icon|back button)$")
    public void iPressOnMenuIcon(String element) throws InterruptedException {
        switch(element) {
            case "menu icon":
                androidSetUp.getDriver().findElement(By.id("Open navigation drawer")).click();
                break;
            case "back button":
                androidSetUp.getDriver().findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Close navigation drawer\"]")).click();
                Thread.sleep(1000);
                break;
        }

    }

    @Then("^I should see the right side menu$")
    public void iShouldSeeTheRightSideMenu() {
        androidSetUp.getDriver().findElement(By.xpath("//*[@text='Unit Converter']"));
    }

    @When("^I press on \"([^\"]*)\"$")
    public void iPressOnMyConversionsButton(String text) throws InterruptedException {
        Thread.sleep(1000);
        androidSetUp.getDriver().findElement(By.xpath(String.format("//*[@text='%s']", text))).click();
    }

    @Then("^I land on My Conversions screen$")
    public void iLandOnMyConversionsScreen() {
        androidSetUp.getDriver().findElement(By.xpath("//*[@text='My conversions']"));
    }

}
