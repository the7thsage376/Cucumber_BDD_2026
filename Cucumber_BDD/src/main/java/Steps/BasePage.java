package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;
import utils.BrowserFactory;

// Constructor setup
public class BasePage {

    BrowserFactory browserFactory = new BrowserFactory();
    
    final WebDriver driver = browserFactory.startBrowser(
        "Edge",
        "https://ndosisimplifiedautomation.vercel.app/#practice"
    );

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    AdminPanelPage adminPanelPage = PageFactory.initElements(driver, AdminPanelPage.class);
    DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    LogoutPage logoutPage = PageFactory.initElements(driver, LogoutPage.class);
    signupPage signupPage = PageFactory.initElements(driver, signupPage.class);


}
