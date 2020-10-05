package Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.setUps;

public class loginTests extends setUps {
    public loginTests(WebDriver driver) {

    }
    @Test(priority = 0)
    public void testALoginPanel () {
        loginPage.verifyLoginPanel (); }

    @Test (priority = 0)
    public void testACompanyLogo () {
        loginPage.verifyCompanyLogo ();}

    @Test (priority = 0)
    public void testAForgotPassword () {
        loginPage.verifyForgotPassword ();
    }
    @Test (priority = 1)
    public void testAPageTitle () throws InterruptedException {
        loginPage.enterUsername ("Admin");
        loginPage.enterPassword ("admin123");
        DashboardPage dashboardPage = loginPage.clickLoginButton ();
        //Check whether the pageTitle is correct
        String pageTitle = "OrangeHRM";
        if (pageTitle.equalsIgnoreCase ("OrangeHRM")) {
            System.out.println ("The page title is " + pageTitle);
        } else {
            System.out.println ("The page title is incorrect. Actual page title is " + pageTitle);
        }

    }





}
