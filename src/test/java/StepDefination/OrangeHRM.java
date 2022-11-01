package StepDefination;

import actions.Actions;
import constants.Constants;

import driverUtils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static actions.Actions.click;
import static constants.Constants.*;
import static pages.EmployeeDetails.*;
import static pages.RegisterationPage.*;
import static pages.HomePage.clickAdd;
import static pages.HomePage.pageTitle;
import static pages.LoginPage.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class OrangeHRM {



    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {


        DriverUtils.driverInvoke(Constants.BrowserName, Constants.OSName);

    }

    @When("User opens URL {string}")
    public void user_opens_url(String string) {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Then("Verify user is redirected to OrangeHRM page and title should be Login")
    public void verify_user_is_redirected_to_orange_hrm_page_and_title_should_be_login() throws InterruptedException {
       Thread.sleep(2000);
        driver.findElement(loginPageTitle);

    }

    @When("User clicks on Username")
    public void user_clicks_on_username() throws InterruptedException {
      Thread.sleep(20);


        driver.findElement(inputUserName).click();
     //   driver.findElement(inputUserName).sendKeys("Admin");
    Actions.sendkey(inputUserName,"Admin");
    }

    @When("User clicks on Password")
    public void user_clicks_on_password() {
        driver.findElement(inputPassword).click();
        driver.findElement(inputPassword).sendKeys("admin123");
    }

    @Then("Clicks on Login")
    public void clicks_on_login() {
        //driver.findElement(clickLogin).click();
        Actions.click(clickLogin);
    }


    @Then("Verify  Page title should be Employee Information")
    public void verify_page_title_should_be_employee_information() {
        WebElement x = driver.findElement(pageTitle);
        Assert.assertTrue(x.isDisplayed());
        driver.findElement(pageTitle);
    }

    @When("User clicks on Add")
    public void user_clicks_on_add() {
        driver.findElement(clickAdd).click();
    }

    @Then("User verify the title should be {string}")
    public void user_verify_the_title_should_be_add_employee(String string) {
        WebElement x = driver.findElement(verifyTitle);
        Assert.assertEquals(x.getText(), string);
        driver.findElement(verifyTitle);
    }

    @Then("User clicks on FirstName")
    public void user_clicks_on_first_name() {
        driver.findElement(inputFirstName).sendKeys("Jagriti");
    }

    @Then("User clicks on LastName")
    public void user_clicks_on_last_name() throws InterruptedException {
        Constants.wait.until(ExpectedConditions.elementToBeClickable(inputLastName));
        driver.findElement(inputLastName).clear();
        driver.findElement(inputLastName).sendKeys("Chopra");
    }

    @When("User click on Save button")
    public void user_click_on_save_button() {

      //  driver.findElement(saveDetails).click();
        Actions.click(saveDetails);

    }

    @Then("User verify the page should  be {string}")
    public void user_verify_the_page_should_be_personal_details(String string) {
        driver.manage().timeouts().pageLoadTimeout(500, SECONDS);
        WebElement x = driver.findElement(detailsPage);
        Assert.assertEquals(x.getText(), string);

        WebElement y = driver.findElement(detailsPage);
        Assert.assertTrue(x.isDisplayed());

        driver.findElement(detailsPage);
    }

    @When("User clicks on PaulB Manoj Collings")
    public void user_clicks_on_paul_b_manoj_collings() {
        driver.manage().timeouts().pageLoadTimeout(10, SECONDS);
      //  driver.findElement(clickPaulCollings).click();
        Actions.click(clickPaulCollings);

    }

    @When("Clicks on Logout option")
    public void clicks_on_logout_option() {
     //   driver.findElement(clickLogout).click();
        Actions.click(clickLogout);
    }

    @Then("Verify user redirected to the Login Page and title should be {string}")
    public void verify_user_redirected_to_the_login_page_and_title_should_be(String string) {

        WebElement x = driver.findElement(loginPageTitle);
        Assert.assertEquals(x.getText(), string);
        driver.findElement(loginPageTitle);

        driver.quit();
    }
}
