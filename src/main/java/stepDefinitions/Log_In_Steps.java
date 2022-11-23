package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.login_page;
import pages.products_page;

public class Log_In_Steps {
    private WebDriver driver;

    login_page login_page;
    products_page products_page;

    @Before
    public void setup(){

     //System.setProperty("webdriver.chrome.driver",
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Given("I navigate to the url {string}")
    public void i_navigate_to_the_url(String url) {
    driver.get(url);
    }
    @And("I enter a valid username {string}")
    public void i_enter_a_valid_username(String uname) throws InterruptedException {
        login_page = new login_page(driver);
        login_page.enterUsername(uname);
        Thread.sleep(1000);
    }
    @And("I enter a valid password {string}")
    public void i_enter_a_valid_password(String pwd) throws InterruptedException {
        login_page.enterPassword(pwd);
        Thread.sleep(1000);
    }
    @When("I click the login button")
    public void i_click_the_login_button() throws InterruptedException {
        login_page.clickLogin();
        Thread.sleep(10000);
    }
    @Then("I am successfully logged into the swag labs website")
    public void i_am_successfully_logged_into_the_swag_labs_website() {
        products_page = new products_page(driver);
        products_page.validate_page();
    }

}
