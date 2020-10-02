package Dashboard;

import Login.loginTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;

public class dashboardTests extends loginTests {
    public dashboardTests(WebDriver driver) {
        super(driver);
    }

    @Test (priority = 0)
    public void testACompanyImage () {
        dashboardPage().verifyCompanyImage();}




    @Test
    public void testADashboardText(){
        dashboardPage().verifyDashboardText();
    }

    @Test
    public void testSubscriber (){
        dashboardPage().clickSubscribe();
    }
    @Test
    public void testLogout(){
        dashboardPage().clickLogout();

    }
    @Test
    public void testWelcome(){
        dashboardPage().clickWelcome();
    }




    }







