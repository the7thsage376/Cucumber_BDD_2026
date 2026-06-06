package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;

// Constructor setup
public class BasePage {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = BrowserFactory.startBrowser(
        "Edge",
        "https://ndosisimplifiedautomation.vercel.app/#practice"
    );

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    AdminPanelPage adminPanelPage = PageFactory.initElements(driver, AdminPanelPage.class);
    DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);


    // Here so both dashboardPage and LogoutPage can inherit it
    @FindBy(xpath = "//span[text()='Menu']")
    protected WebElement menuButton;


}
