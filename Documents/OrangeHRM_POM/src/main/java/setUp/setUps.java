package setUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {
    protected LoginPage loginPage;

    protected DashboardPage dashboardPage;

    public setUps(WebDriver driver) {
        this.driver = driver;


        {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loginPage = new LoginPage(driver);
        }
        //@AfterTest
        public void cleanUp () {
            driver.manage().deleteAllCookies();

            @AfterTest
            public void quitBrowser (){
            driver.quit();

        }
    }
}