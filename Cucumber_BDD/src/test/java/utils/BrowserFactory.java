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
        if (browserChoice.equalsIgnoreCase("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();

            // 1. Add all arguments first
            // chromeOptions.addArguments("--headless=new");
            chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.addArguments("--disable-sync");
            chromeOptions.addArguments("--disable-background-networking");
            chromeOptions.addArguments("--disable-component-update");
            chromeOptions.addArguments("--disable-default-apps");

            // 2. Initialize the driver with the configured options
            driver = new ChromeDriver(chromeOptions);

        } else if (browserChoice.equalsIgnoreCase("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            // edgeOptions.addArguments("--headless=new");
            edgeOptions.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(edgeOptions);
        }

        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get(url);
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}