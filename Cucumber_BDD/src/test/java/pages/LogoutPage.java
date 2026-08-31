package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {
    WebDriver driver;
    WebDriverWait wait;

    public LogoutPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(), '← Back to Website')]")
    WebElement backToWebsiteButton;

    @FindBy(xpath = "//span[text()='Logout']")
    WebElement logoutButton;


    public void BackToWebsite(){
        wait.until(ExpectedConditions.elementToBeClickable(backToWebsiteButton)).click();

    }

    public void LogOut(){
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton)).click();
    }

    public void clickConfirmLogout() {

        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }

}
