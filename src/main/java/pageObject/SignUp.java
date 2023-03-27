package pageObject;
import org.openqa.selenium.By;
public class SignUp {
    public By clickSignUpButtonNavBar = By.id("signin2");
    public By username = By.id("sign-username");
    public By password = By.id("sign-password");
    public By signUpButton = By.xpath("//button[@type='button'][text()='Sign up']");
}
