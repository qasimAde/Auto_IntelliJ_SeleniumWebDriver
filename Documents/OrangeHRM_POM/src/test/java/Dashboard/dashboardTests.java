package Dashboard;

import Login.loginTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;

public class dashboardTests extends loginTests {
    public dashboardTests(WebDriver driver) {
        super(driver);
    }

    @Test
    public void testAPageTitle() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        //Confirm that user is in dashboard using URL


        @Test
        public void testPendingLeaveRequests () {
            WebDriver driver;
            if (driver.getPageSource().contains("01. Kevin Mathews 03-08-2020")) {
                System.out.println("Text is present");
            } else {
                System.out.println("Text is absent");
            }
        }

        @Test(priority = 1)
        //This class extends to the SetupTests as the SetupTests class contains all the setup requirements to run our test
        public void testLogout ()
        {
            //Handler for dashboard page
            DashboardPage.clickWelcome();
            DashboardPage.clickLogout();

        }


    }
}
