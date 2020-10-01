package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage {
    public DashboardPage(WebDriver driver){     this.driver = driver;}

    private WebDriver driver;
    //Using By to locate dashboardPage elements
    private By welcome = By.id ("welcome");
    private By logoutButton = By.xpath ("//*[@id=\"welcome-menu\"]/ul/li[2]/a");
    private By pendingLeaveRequests = By.xpath ("href=\"/index.php/leave/viewLeaveRequest/id/13\"");

    //Confirm the dashboard URL
    public String getDashboardPageUrl() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        //wait until URL is visible
        wait.until(ExpectedConditions.urlToBe("https://opensource-demo.orangehrmlive.com/index.php/dashboard"));
        return driver.getCurrentUrl();
    }

    public void clickWelcome () throws InterruptedException {
        Thread.sleep (10000);
        //Find the welcome element and click on the welcome button
        driver.findElement (welcome).click ();
    }

    public LoginPage clickLogout() throws InterruptedException {
        Thread.sleep (3000);
        //Find the logout element and click on the logout button
        driver.findElement (logoutButton).click ();
        return new LoginPage (driver);

    }


    



}
