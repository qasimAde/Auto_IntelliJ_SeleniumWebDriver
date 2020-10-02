package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By welcome = By.id ("welcome");
    private By logoutButton = By.linkText("Logout");
    private By subscriberButton = By.id("Subscriber_link");

    public void clickWelcome () {
        //Find the welcome element and click on the welcome button
        driver.findElement (welcome).click ();
    }

    public LoginPage clickLogout()  {
        //Find the logout element and click on the logout button
        driver.findElement (logoutButton).click ();
        return new LoginPage (driver);

    }
    public subscriberPage clickSubscribe()  {
        //Find the logout element and click on the logout button
        driver.findElement (subscriberButton).click ();
        return new subscriberPage(driver);

    }

}
