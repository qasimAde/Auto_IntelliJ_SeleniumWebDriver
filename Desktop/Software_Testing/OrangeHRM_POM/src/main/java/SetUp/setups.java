package SetUp;
//"<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >"
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class setups {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    protected WebDriver driver ;
    public setups(WebDriver driver){
        this.driver  = driver;
        PageFactory.initElements(driver,this  );
    }
    @BeforeTest
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromeDriver.exe");
        driver = new ChromeDriver();
        //Maximise the window
        driver.manage().window().maximize();
        //Import project URL = OrangeHRM URL
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Waiting globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Instantiate the login page after launching the browser-Handle
        loginPage = new LoginPage (driver);
    }
    @AfterTest
    public void quitBrowser() throws InterruptedException{

        driver.quit();
    }

}
