package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class signupPage {
    WebDriver driver;
    WebDriverWait wait;

    public signupPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Login')]")
    WebElement loginButton;

    @FindBy(id = "signup-toggle")
    WebElement signupButton;

    @FindBy(id = "register-group")
    WebElement GroupSelector;


    public void SignUp(){

        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(signupButton)).click();


    }

    public Boolean VerifyGroupName(String groupName ){

        wait.until(ExpectedConditions.visibilityOf(GroupSelector));
        return GroupSelector.getText().contains(groupName);
    }

    //Verify that the group created is displayed on the group selector.
}
