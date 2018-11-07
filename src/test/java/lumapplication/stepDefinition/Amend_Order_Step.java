package lumapplication.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amend_Order_Step {

    WebDriver driver = new ChromeDriver();

    // Specify path for chrome driver

    @Given("^the customer on Account dashboard page$")
    public void theCustomerOnAccountDashboardPage() throws Throwable{
     //driver.findElement("")
        // specify path for chromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
}

    @When("^the Customer clicks on My Order tab$")
    public void theCustomerClicksOnMyOrderTab() throws Throwable {

        //driver.

    }

    @And("^the Customer searches for Above order number (\\d+)$")
    public void theCustomerSearchesForAboveOrderNumber(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^clicks to Amend the order (\\d+) above$")
    public void clicksToAmendTheOrderAbove(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the Amendment confirmation page is displayed with confirmation reference link sent to the Customer’s email address successfully$")
    public void theAmendmentConfirmationPageIsDisplayedWithConfirmationReferenceLinkSentToTheCustomerSEmailAddressSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
