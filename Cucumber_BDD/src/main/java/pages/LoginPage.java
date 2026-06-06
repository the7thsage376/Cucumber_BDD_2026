package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(), 'Login')]")
    WebElement loginButton;

    @FindBy(id = "login-email")
    WebElement loginEmail;

    @FindBy( id = "login-password")
    WebElement loginPassword;

    @FindBy(name = "loginSubmit")
    WebElement loginSubmit;
    
}

// Assert that we're on the dashboard page with Welcome back,
