package pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static By loginPageTitle= By.xpath("//h5[text()='Login']");
    public static By inputUserName=By.xpath(" //input[@name='username']") ;
    public static By inputPassword=By.xpath(" //input[@name='password']") ;
    public static By clickLogin=By.xpath("//button[text()=' Login '] ") ;

}
