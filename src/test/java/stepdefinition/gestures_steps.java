package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import org.openqa.selenium.Dimension;
import stepdefinition.support.androidSetUp;

/**
 * Created by liudmylaiterman on 11/27/17.
 */


public class gestures_steps {
    public static void swipeVertically( double startPercentage, double finalPercentage, double anchorPercentage) throws Exception {
        Dimension size = androidSetUp.getDriver().manage().window().getSize();
        int y = (int)(size.getHeight()*anchorPercentage);
        int startX = (int)(size.getWidth()*startPercentage);
        int finalX = (int)(size.getWidth()*finalPercentage);
        androidSetUp.getDriver().swipe(startX, y, finalX, y, 1000);
        Thread.sleep(1000);
    }

    @When("^I swipe from left to right$")
    public void iSwipeFromLeftToRight() throws Exception {
        swipeVertically(0.05, 0.95, 0.5);
    }

    @When("^I swipe from right to left$")
    public void iSwipeFromRightToLeft() throws Exception {
        swipeVertically(0.95, 0.05, 0.5);
    }
}
