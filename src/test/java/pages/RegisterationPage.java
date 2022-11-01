package pages;

import org.openqa.selenium.By;

public class RegisterationPage {
    public static By verifyTitle=By.xpath("//h6[text()='Add Employee']");
    public static By inputFirstName=By.xpath(" //input[@name='firstName']");
    public static By inputLastName=By.xpath("//input[@name='lastName']");
    public static By saveDetails =By.xpath("//button[text()=\" Save \"]");

}
