package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

    @FindBy(xpath = "//button[contains(text(), '← Back to Website')]")
    WebElement backToWebsiteButton;

    @FindBy(xpath ="//span[text()='Logout']" )
    WebElement logoutButton;
}
