package Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.setUps;

public class LoginTests extends setUps {
    private WebDriver driver;
    public LoginTests(WebDriver driver){
        this.driver=driver;
    }

    @Test (priority = 1)
    public void testACompanyLogo () {
        loginPage.verifyCompanyLogo ();}


    @Test (priority = 2)
    public void testAForgotPassword () {
        loginPage.verifyForgotPassword ();
    }

    @Test(priority = 3)
    public void testALoginPanel () {
        loginPage.verifyLoginPanel (); }

    @Test (priority = 4)
    public void testAPageTitle () {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        //Check whether the pageTitle is correct
        String pageTitle = "OrangeHRM";
        if (pageTitle.equalsIgnoreCase("OrangeHRM")) {
            System.out.println("The page title is " + pageTitle);
        } else {
            System.out.println("The page title is incorrect. Actual page title is " + pageTitle);
        }
    }
        @Test
        public void testPendingLeaveRequest () throws InterruptedException {
            if (driver.getPageSource ().contains ("01. Kevin Mathews 03-08-2020")) {
                System.out.println ("Text is present");
            } else { System.out.println ("Text is absent"); }}

        @Test (priority = 1)
        //This class extends to the SetupTests as the SetupTests class contains all the setup requirements to run our test
        public void  testLogout() throws InterruptedException
        {
            //Handler for dashboard page
            DashboardPage.clickWelcome();
            DashboardPage.clickLogout ();

        }

    }


}
