package testSetup;

import SetUp.setups;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class setupTests extends setups {
    public setupTests (WebDriver driver) {
        super (driver);
    }

    @Test(priority = 0)
    public void testGetPageURL (){
        String pageURL = "https://opensource-demo.orangehrmlive.com";
        if(pageURL.equalsIgnoreCase ("https://opensource-demo.orangehrmlive.com")) {
            System.out.println ("The webPage URL is " + pageURL);
        } else {
            System.out.println ("Invalid URL. Actual webPage URL is " + pageURL);
        }
    }


}



