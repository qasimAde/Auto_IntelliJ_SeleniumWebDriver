package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    public DashboardPage(WebDriver driver) {
        this.driver=driver;
    }
    public void companyLogo(){
        driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img")).isDisplayed();
    }
    public void pageTitle(){
        System.out.println(driver.getTitle());
    }
    private By welcome= By.id("welcome");
    public void clickWelcome()throws InterruptedException{
        Thread.sleep(5000);
        driver.findElement(welcome).click();
    }
    public LoginPage clickLogout()throws InterruptedException{
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
        return new LoginPage(driver);
    }
}
