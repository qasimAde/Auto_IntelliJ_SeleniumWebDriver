package TestSetup;

import org.testng.annotations.Test;

public class setupTests {
    @Test
    public void testSetup (){
        String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/login/";
        if(pageURL.equalsIgnoreCase ("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login")) {
            System.out.println("The webPage URL is " + pageURL);
        } else System.out.println("Invalid URL. Actual webPage URL is " + pageURL);
    }
}
