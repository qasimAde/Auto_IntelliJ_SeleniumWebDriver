package loginTest;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.SetUps;

public class LoginTests extends SetUps {
    @Test
    public void testAppLogin() throws InterruptedException {
        loginpage.enterUsername("Admin");
        loginpage.enterPassword("admin123");
        DashboardPage dashboardPage = loginpage.clickLoginBtn();
        dashboardPage.companyLogo();
        dashboardPage.pageTitle();
        dashboardPage.clickWelcome();
        dashboardPage.clickLogout();
    }
}
