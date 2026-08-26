package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Add explicit waits later
public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }


    // add menu button locator

    @FindBy(xpath = "//span[text()='Admin Panel']")
    WebElement adminPanelButton;

    @FindBy(xpath = "//button//span[text() = 'Menu']")
    WebElement menuButton;



    //Click on menu button
    public void clickMenuButton(){
        menuButton.click();
    }

    public void clickAdminPanelButton(){

        adminPanelButton.click();
    }

//    public void WelcomeMessageIsDisplayed(){
//        wait()
//    }
// Add assertion for being on the dashboard

}
