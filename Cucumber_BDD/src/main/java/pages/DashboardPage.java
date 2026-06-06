package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


// Should I add assertions here?
public class DashboardPage {

    @FindBy(xpath = "//span[text()='Menu']")
    WebElement menuButton;

    @FindBy(xpath = "//span[text()='Admin Panel']")
    WebElement adminPanelButton;


}
