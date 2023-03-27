package pageObject;
import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class PurchaseAProduct extends BasePage {
    public By logInButtonInNavBar = By.id("login2");
    public By username = By.id("loginusername");
    public By password = By.id("loginpassword");
    public By loginButton = By.xpath("//button[@type='button'][text()='Log in']");
    public By nameOfUser = By.id("nameofuser");
    public By selectProduct = By.xpath("(//img[@class='card-img-top img-fluid'])[1]");
    public By addToCartButton = By.xpath("//a[@href='#'][text()='Add to cart']");
    public By cartButtonInNavBar = By.xpath("//a[@href='cart.html']");
    public By placeOrderButton = By.xpath("//button[@type='button'][text()='Place Order']");
    public By name = By.id("name");
    public By country = By.id("country");
    public By city = By.id("city");
    public By creditCard = By.id("card");
    public By month = By.id("month");
    public By year = By.id("year");
    public By purchase = By.xpath("//button[@type='button'][text()='Purchase']");
    public By purchaseCompleted = By.xpath("//h2[text()='Thank you for your purchase!']");
    public By okButtonOnSuccessfulPurchaseButton = By.xpath("//button[@class='confirm btn btn-lg btn-primary'][text()='OK']");
}
