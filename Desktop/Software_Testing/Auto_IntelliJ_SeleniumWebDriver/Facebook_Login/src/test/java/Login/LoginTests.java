package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //Import selenium webDriver
    private  WebDriver driver ;
    //Import chrome Driver
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Resources/chromeDriver.exe");
        driver = new ChromeDriver();
        //Import project URL = Facebook URL
        driver.get("https://facebook.com/login");
        //Waiting globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximise the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());

        //Locate username field
        driver.findElement(By.id("email")).sendKeys("salub789@mail.com");
        //Locate password field
        driver.findElement(By.id("pass")).sendKeys("@Admin123.");

        //Click on the sign in button
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        Thread.sleep(10000);
        driver.quit ();

    }
    public static void main (String[] args) throws InterruptedException{
        LoginTests test= new LoginTests();
        test.setup();

    }


}
