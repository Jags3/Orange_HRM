package driverUtils;

import constants.Constants;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ContextAware;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.HasAuthentication;

import static constants.Constants.driver;


public class DriverUtils {

    public static WebDriver driverInvoke(String BrowserName, String OSName) {

        if (OSName.contains("Windows")) {

            if (BrowserName.contains("Edge")) {

                WebDriverManager.edgedriver().setup();
                 driver = new EdgeDriver();
               // WebDriverWait wait = new WebDriverWait(driver, 20);


            } else if (BrowserName.contains("Chrome")) {
                WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
             //   WebDriverWait wait = new WebDriverWait(driver, 20);
                driver.manage().window().maximize();

            } else if (BrowserName.contains("FireFox")) {
                WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
             //   WebDriverWait wait = new WebDriverWait(driver, 20);
                driver.manage().window().maximize();
            }
        } else if (OSName.contains("MAC")) {
            WebDriverManager.chromedriver().setup();
            driver = new SafariDriver();
          //  WebDriverWait wait = new WebDriverWait(driver, 20);
            driver.manage().window().maximize();
        }

        return driver;
    }
}