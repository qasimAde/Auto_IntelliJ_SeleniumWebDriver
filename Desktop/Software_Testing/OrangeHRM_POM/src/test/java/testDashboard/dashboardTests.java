package testDashboard;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import testLogin.loginTests;

public class dashboardTests extends loginTests {
    public dashboardTests (WebDriver driver) {
        super (driver); }

    @Test
    public void testAPageTitle () throws InterruptedException {
        loginPage.enterUsername ("Admin");
        loginPage.enterPassword ("admin123");
        DashboardPage dashboardPage = loginPage.clickLoginButton ();
        //Confirm that user is in dashboard using URL
        String dashboardUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        Assert.assertEquals (dashboardPage.getDashboardPageUrl (), dashboardUrl, "You are not on user dashboard");
        Thread.sleep (10000); }

    @Test
    public void testPendingLeaveRequests () throws InterruptedException {
        if (driver.getPageSource ().contains ("01. Kevin Mathews 03-08-2020")) {
            System.out.println ("Text is present");
        } else { System.out.println ("Text is absent"); }}

    @Test (priority = 1)
    //This class extends to the SetupTests as the SetupTests class contains all the setup requirements to run our test
    public void  testLogout() throws InterruptedException
    {
        //Handler for dashboard page
        dashboardPage.clickWelcome ();
        dashboardPage.clickLogout ();
        Thread.sleep (1000);
        String loginPageURL = "https://opensource-demo.orangehrmlive.com/";
        Assert.assertEquals (loginPage.getLoginPageURL (), loginPageURL, "You are not on user dashboard");
        Thread.sleep (10000);
    }

}
