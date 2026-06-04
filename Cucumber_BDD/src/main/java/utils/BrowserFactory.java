package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        ChromeOptions chromeOptions = new ChromeOptions();
        EdgeOptions edgeOptions = new EdgeOptions();

        if (browserChoice.equalsIgnoreCase("ChRoMe")){
            chromeOptions.addArguments("--headless");

            driver = new ChromeDriver(chromeOptions);

        } else if (browserChoice.equalsIgnoreCase(("EdgE"))){
            edgeOptions.addArguments("--headless");

            driver = new EdgeDriver(edgeOptions);

        }
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get(url);
        return driver;


    }
}
