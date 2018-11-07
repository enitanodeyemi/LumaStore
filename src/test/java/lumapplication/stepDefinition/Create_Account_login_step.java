package lumapplication.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Account_login_step {



    WebDriver driver;

    @Given("^Customer on Create new customer Page$")
    public void customerOnCreateNewCustomerPage() throws Throwable {
      //Specify path for chrome driver
      System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
      driver = new ChromeDriver();
      //Launch Luma application
        driver.get("http://127.0.0.1/Magento/");

        //Maximise chrome browser
        driver.manage().window().maximize();

      //Click on Create an Account
      driver.findElement(By.linkText("Create an Account")).click();
    }

    @When("^I enter \"([^\"]*)\" as Last Name$")
    public void iEnterAsLastName(String arg0) throws Throwable {
        //Enter first name
        driver.findElement(By.id("firstname")).sendKeys("eny");
        driver.findElement(By.id("lastname")).sendKeys("ode");
    }


    @And("^I enter \"([^\"]*)\" as Valid Email$")
    public void iEnterAsValidEmail(String arg0) throws Throwable {
        driver.findElement(By.name("email")).sendKeys("eny@yahoo.com");
    }

    @And("^I enter “abraca” as Password$")
    public void iEnterAbracaAsPassword() throws Throwable {
        driver.findElement(By.name("password")).sendKeys("Abraca@123");
    }

    @And("^I enter  “abraca” as Confirm Password$")
    public void iEnterAbracaAsConfirmPassword() throws Throwable {

        driver.findElement(By.name("password_confirmation")).sendKeys("Abraca@123");

    }

    @And("^I click on Create an Account$")
    public void iClickOnCreateAnAccount() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();

    }

    @Then("^My Account Page is Displayed Successfully$")
    public void myAccountPageIsDisplayedSuccessfully() throws Throwable {

        System.out.println("Welcome to Dashboard");


    }
}

