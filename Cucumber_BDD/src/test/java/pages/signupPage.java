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

    @FindBy(id = "signup-toggle")
    WebElement signupButton;

    @FindBy(id = "register-group")
    WebElement GroupSelector;



    public void SignUp(){

        wait.until(ExpectedConditions.elementToBeClickable(signupButton)).click();
    }

    public void GroupSelector(){
        wait.until(ExpectedConditions.elementToBeClickable(GroupSelector)).click();
    }

    //Verify that the group created is displayed on the group selector.
}
