package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signupPage extends BasePage{
    // Login button again. Add it to basePage


    @FindBy(id = "signup-toggle")
    WebElement signupButton;

    @FindBy(id = "register-group")
    WebElement GroupSelector;
}
