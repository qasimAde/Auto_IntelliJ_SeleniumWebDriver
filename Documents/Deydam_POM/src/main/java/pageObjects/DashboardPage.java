package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By dropDownButton = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button[2]");
    private By logoutButton = By.linkText("Log Out");
    private By companyImage = By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[1]/a");

    public void menuButton () {
        //Find the welcome element and click on the welcome button
        driver.findElement (dropDownButton).click ();
    }

    public LoginPage clickLogout()  {
        //Find the logout element and click on the logout button
        driver.findElement (logoutButton).click ();
        return new LoginPage (driver);

    }


    public void verifyCompanyImage(){
        //Find the company image element and verify
        driver.findElement (companyImage).isDisplayed ();}


}
