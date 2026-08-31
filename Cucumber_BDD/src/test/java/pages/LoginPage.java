package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[contains(text(), 'Login')]")
   WebElement loginButton;

    @FindBy(id = "login-email")
   WebElement loginEmail;

    @FindBy( id = "login-password")
   WebElement loginPassword;

    @FindBy(name = "loginSubmit")
   WebElement loginSubmit;


    public void clickLoginButton(){

        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void LoginEmailField( String email ){

        wait.until(ExpectedConditions.visibilityOf(loginEmail)).sendKeys(email);
    }

    public void LoginPasswordField( String password){

        wait.until(ExpectedConditions.visibilityOf(loginPassword)).sendKeys(password);
    }

    public void clickLoginSubmit(){

        wait.until(ExpectedConditions.elementToBeClickable(loginSubmit)).click();
    }
}

// Assert that we're on the dashboard page with Welcome back,
