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
        //Import project URL = Monosnap URL
        driver.get("https://monosnap.com");
        //Waiting globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximise the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());

        //Click on the sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click();
        //Locate email field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[1]")).sendKeys("monosnap23@mailinator.com");
        //Locate email field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[2]")).sendKeys("@Admin123.");
        //Click on the sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
        Thread.sleep(10000);
        driver.quit ();

    }
    public static void main (String[] args) throws InterruptedException{
        LoginTests test= new LoginTests();
        test.setup();

    }


}
