package setUp;
//"<!DOCTYPE suite SYSTEM " https://testng.org/testng-1.0.dtd" >"
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import setUp.setUps;

public class setupTests extends setUps {

    @Test
    public void testSetup (){
        String pageURL = "https://opensource-demo.orangehrmlive.com";
        if(pageURL.equalsIgnoreCase ("https://opensource-demo.orangehrmlive.com"))
            System.out.println("The webPage URL is " + pageURL);
        else System.out.println("Invalid URL. Actual webPage URL is " + pageURL);
    }




}
