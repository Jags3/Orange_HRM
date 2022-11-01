package actions;

import org.openqa.selenium.By;

import static constants.Constants.driver;
import static pages.LoginPage.inputUserName;
import static pages.RegisterationPage.verifyTitle;

public class Actions {
    public static void click(By locator) {
        driver.findElement(locator).click();


    }

    public static void sendkey (By locator ,String input){
        driver.findElement(locator).sendKeys(input);
        //driver.findElement(inputUserName).sendKeys("Admin");

    }

}
