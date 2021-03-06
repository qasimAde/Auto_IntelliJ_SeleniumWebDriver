package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import setUp.setUps;

import java.util.List;

public class LoginPage extends setUps {
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    private WebDriver driver;
    //Using By as a location to identify the login fields

    private By username = By.id ("txtUsername");
    private By password = By.id ("txtPassword");
    private By loginButton = By.id ("btnLogin");
    private By companyLogo = By.xpath ("//*[@id=\"divLogo\"]/img");
    private By forgotPassword = By.xpath ("//div[@id='forgotPasswordLink']/a[@href='/index.php/auth/requestPasswordResetCode']");
    private By loginPanel = By.xpath ("//*[@id=\"logInPanelHeading\"]");

    public void verifyCompanyLogo (){
        //Find the company logo element and verify
        driver.findElement (companyLogo).isDisplayed ();}
    public void verifyForgotPassword (){
        //Find the forgot password elements
        driver.findElement (forgotPassword).isDisplayed ();}
    public void verifyLoginPanel () {
        //Find the username element and enter the username
        driver.findElement(loginPanel).getText();
    }

    public void enterUsername(String uName){

        driver.findElement(username).sendKeys(uName);
    }
    public void enterPassword (String pwd){
        //Find the username element and enter the username
        driver.findElement (password).sendKeys (pwd);}

    public DashboardPage clickLoginButton (){
        //Find the username element and enter the username
        driver.findElement (loginButton).click ();
        return new DashboardPage (driver);}



}

