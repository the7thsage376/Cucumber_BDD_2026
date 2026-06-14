package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signupPage {
    WebDriver driver;

    @FindBy(id = "signup-toggle")
    WebElement signupButton;

    @FindBy(id = "register-group")
    WebElement GroupSelector;

    //Verify that the group created is displayed on the group selector.
}
