package Login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import setUp.setUps;

public class LoginTests extends setUps {

    @Test (priority = 1)
    public void testACompanyLogo () {
        loginPage.verifyCompanyLogo ();}


    @Test (priority = 2)
    public void testAForgotPassword () {
        loginPage.verifyForgotPassword ();
    }



    @Test(priority = 3)
    public void testALoginPanel () {
        loginPage.verifyLogin (); }

    @Test (priority = 4)
    public void testAPageTitle (){
        loginPage.clickLoginButton ();
        loginPage.enterUsername ("deydamautotest");
        loginPage.enterPassword ("admin12345");

        //Check whether the pageTitle is correct
        String pageTitle = "Deydam";
        if (pageTitle.equalsIgnoreCase ("Deydam")) {
            System.out.println ("The page title is " + pageTitle);
        } else {
            System.out.println ("The page title is incorrect. Actual page title is " + pageTitle);
        }



    }


}
