package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LoginPage extends setUps {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By username = By.id ("username");
    private By password = By.id ("password");
    private By getStarted = By.xpath ("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[1]/div/button");
    private By forgotPassword = By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div[2]/a");
    private By loginButton = By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button");
    private By companyLogo = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/nav/a/img");


    public void verifyForgotPassword (){
        //Find the forgot password elements
        driver.findElement (forgotPassword).isDisplayed ();}
    public void verifyLogin () {
        //Find the username element and enter the username
        driver.findElement(loginButton).getText();
    }

    public void enterUsername(String uName){

        driver.findElement(username).sendKeys(uName);
    }

    public void verifyCompanyLogo (){
        //Find the company logo element and verify
        driver.findElement (companyLogo).isDisplayed ();}

    public void enterPassword (String pwd){
        //Find the username element and enter the username
        driver.findElement (password).sendKeys (pwd);}



    //public DashboardPage clickGetStartedButton (){
        //Find the username element and enter the username
       // driver.findElement (getStarted).click ();
        //return new DashboardPage (driver);}

    public DashboardPage clickLoginButton (){
        //Find the username element and enter the username
        driver.findElement (loginButton).click ();
        return new DashboardPage (driver);}


}
