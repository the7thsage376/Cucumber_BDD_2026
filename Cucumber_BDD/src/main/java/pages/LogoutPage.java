package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.BrowserFactory.driver;

public class LogoutPage {

    @FindBy(xpath = "//button[contains(text(), '← Back to Website')]")
    WebElement backToWebsiteButton;

    @FindBy(xpath ="//span[text()='Logout']" )
    WebElement logoutButton;

    //click on logout popup
    driver.switchTo().alert().accept();
}
