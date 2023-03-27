package stepDefinitions;

import common.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.SignUp;
import java.time.Duration;
public class SignUp_Steps extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    SignUp signUp = new SignUp();
    public String generateUsername(){
        String generatedUsername = "test"+ Math.random()+"@test.com";
        return generatedUsername;
    }
    @Given("I click on Signup on the page")
    public void i_click_on_signup_page() {
        driver.findElement(signUp.clickSignUpButtonNavBar).click();
    }
    @When("I enter username")
    public void i_enter_username() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signUp.username));
        driver.findElement(signUp.username).sendKeys(generateUsername());
    }
    @When("I enter password")
    public void i_enter_password() {
        driver.findElement(signUp.password).sendKeys("123456");
    }
    @When("I click Sign up button")
    public void i_click_sign_up_button() {
        driver.findElement(signUp.signUpButton).click();
    }
    @Then("I should received a {string} popup message")
    public void i_should_received_a_sign_up_successful_popup_message(String message) {
        wait.until(ExpectedConditions.alertIsPresent());
        String successfulMsg = driver.switchTo().alert().getText();
        Assert.assertEquals(message,successfulMsg);
    }
}
