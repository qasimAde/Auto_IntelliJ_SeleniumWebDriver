package setUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class setUps {
    protected LoginPage loginPage;
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage=new LoginPage(driver);
    }
   //@AfterTest
    public void cleanUp(){
       driver.manage().deleteAllCookies();

   }//

    @AfterTest
    public  void quitBrowser(){
        driver.quit();

    }
}
