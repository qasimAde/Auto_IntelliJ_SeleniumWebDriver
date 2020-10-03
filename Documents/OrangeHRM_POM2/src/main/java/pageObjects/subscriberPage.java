package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class subscriberPage {

    public subscriberPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By subscriberName = By.id("subscriber_name");
    private By subscriberEmail = By.id("subscriber_email");
    private By subscribeButton = By.id("btnSubscribe");
    private By DashboardPage = By.linkText("Dashboard");
    private By welcome = By.id("welcome");
    private By logoutButton = By.linkText("Logout");

    public void enterName(String sName) {

        driver.findElement(subscriberName).sendKeys(sName);
    }

    public void enterEmail(String sEmail) {
        //Find the username element and enter the username
        driver.findElement(subscriberEmail).sendKeys(sEmail);
    }

    public void clicksubscribeButton() {
        //Find the username element and enter the username
        driver.findElement(subscribeButton).click();
    }

    public pageObjects.DashboardPage clickdashboardMenu() {
        //Find the username element and enter the username
        driver.findElement(DashboardPage).click();
        return new DashboardPage(driver);

    }

    public void clickWelcome() {
        //Find the welcome element and click on the welcome button
        driver.findElement(welcome).click();
    }

    public LoginPage clickLogout() {
        //Find the logout element and click on the logout button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);


    }
}
