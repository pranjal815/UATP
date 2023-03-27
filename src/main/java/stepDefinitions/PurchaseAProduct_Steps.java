package stepDefinitions;

import common.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PurchaseAProduct;
import org.junit.Assert;
import java.time.Duration;

public class PurchaseAProduct_Steps extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    PurchaseAProduct purchaseAProduct = new PurchaseAProduct();
    @And("I can login successfully into the application")
    public void i_can_login_successfully_into_the_application() {
        driver.findElement(purchaseAProduct.logInButtonInNavBar).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.username));
        driver.findElement(purchaseAProduct.username).sendKeys("pranjal@pranjal.com");
        driver.findElement(purchaseAProduct.password).sendKeys("123456");
        driver.findElement(purchaseAProduct.loginButton).click();
    }
    @When("I select the product from Product Store page")
    public void i_select_the_product_from_product_store_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.nameOfUser));
        driver.findElement(purchaseAProduct.selectProduct).click();
    }
    @And("I click Add to cart button")
    public void i_click_add_to_cart_button() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.addToCartButton));
        driver.findElement(purchaseAProduct.addToCartButton).click();
    }
    @Then("I should received Product added popup message")
    public void i_should_received_product_added_popup_message() {
        wait.until(ExpectedConditions.alertIsPresent());
        String successfulMsg = driver.switchTo().alert().getText();
        Assert.assertEquals("Product added.",successfulMsg);
        driver.switchTo().alert().accept();
    }
    @When("I click Cart button from the navbar menu")
    public void i_click_cart_button_from_the_navbar_menu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.cartButtonInNavBar));;
        driver.findElement(purchaseAProduct.cartButtonInNavBar).click();
    }
    @And("I click Place Order")
    public void i_click_place_order() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.placeOrderButton));
        driver.findElement(purchaseAProduct.placeOrderButton).click();
    }
    @And("I enter name as {string}")
    public void i_enter_name_as(String customerName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.name));
        driver.findElement(purchaseAProduct.name).sendKeys(customerName);
    }
    @And("I enter country as {string}")
    public void i_enter_country_as(String customerCountry) {
        driver.findElement(purchaseAProduct.country).sendKeys(customerCountry);
    }
    @And("I enter city as {string}")
    public void i_enter_city_as(String customerCity) {
        driver.findElement(purchaseAProduct.city).sendKeys(customerCity);
    }
    @And("I enter credit card as {string}")
    public void i_enter_credit_card_as(String customerCreditCard) {
        driver.findElement(purchaseAProduct.creditCard).sendKeys(customerCreditCard);
    }
    @And("I enter month as {string}")
    public void i_enter_month_as(String expiryMonth) {
        driver.findElement(purchaseAProduct.month).sendKeys(expiryMonth);
    }
    @And("I enter year as {string}")
    public void i_enter_year_as(String expiryYear) {
        driver.findElement(purchaseAProduct.year).sendKeys(expiryYear);
    }
    @And("I click Purchase button")
    public void i_click_purchase_button() {
        driver.findElement(purchaseAProduct.purchase).click();
    }
    @Then("I should see {string} popup message")
    public void i_should_popup_message(String message) {
        WebElement purchasedMessage = driver.findElement(purchaseAProduct.purchaseCompleted);
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.purchaseCompleted));
        Assert.assertEquals(purchasedMessage.getText(),message);
    }
    @When("I click Ok button")
    public void i_click_ok_button() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.okButtonOnSuccessfulPurchaseButton));
        driver.findElement(purchaseAProduct.okButtonOnSuccessfulPurchaseButton).click();
    }
    @Then("I should be redirected to Product Page")
    public void i_should_be_redirected_to_product_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(purchaseAProduct.selectProduct));
        driver.findElement(purchaseAProduct.selectProduct).click();
    }
}
