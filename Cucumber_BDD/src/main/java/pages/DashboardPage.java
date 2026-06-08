package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


// Should I add assertions here?
public class DashboardPage extends BasePage {
    WebDriver driver;


    @FindBy(xpath = "//span[text()='Admin Panel']")
    WebElement adminPanelButton;


}
