package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AdminPanelPage;
import pages.DashboardPage;
import pages.LoginPage;
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


}
