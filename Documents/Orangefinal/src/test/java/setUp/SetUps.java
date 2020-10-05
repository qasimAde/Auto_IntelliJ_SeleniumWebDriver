package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

public class SetUps {
    //create web driver object
    private WebDriver driver;
    //create login page object
    protected LoginPage loginpage;
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginpage = new LoginPage(driver);
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
