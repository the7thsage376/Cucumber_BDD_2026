package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[contains(normalize-space(.), 'Welcome back')]")
    WebElement welcomeBanner;

    @FindBy(xpath = "//span[text()='Admin Panel']")
    WebElement adminPanelButton;

    @FindBy(xpath = "//button//span[text() = 'Menu']")
    WebElement menuButton;

    @FindBy(xpath = "//button[contains(text(), '← Back to Website')]")
    WebElement backToWebsiteButton;

    @FindBy(xpath = "//span[text()='Logout']")
    WebElement logoutButton;

    public boolean isUserLoggedIn() {
        // Waits for either the URL hash to reach #dashboard OR the banner to show
        return wait.until(ExpectedConditions.or(
                ExpectedConditions.urlContains("#dashboard"),
                ExpectedConditions.visibilityOf(welcomeBanner)
        ));
    }

    //Click on menu button
    public void clickMenuButton() {

        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click();
    }

    public void clickAdminPanelButton() {

        wait.until(ExpectedConditions.elementToBeClickable(adminPanelButton)).click();
    }

    public void CompleteLogout() {
        wait.until(ExpectedConditions.elementToBeClickable(backToWebsiteButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();

        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
}
