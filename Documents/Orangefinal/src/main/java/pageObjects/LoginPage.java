package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    private By username= By.id("txtUsername");
    private By password= By.id("txtPassword");
    public void enterUsername(String Uname){
        driver.findElement(username).sendKeys(Uname);
    }
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public DashboardPage clickLoginBtn(){
        driver.findElement(By.id("btnLogin")).click();
        return new DashboardPage(driver);
    }
}
