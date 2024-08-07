package io.loop.test.day7;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.BrowserUtilities;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;


import java.util.Set;

public class T2_window extends TestBase {


    /*
    1. Create new test and make set ups
    2. Go to : https://www.amazon.com
    3. Copy paste the lines from below into your class
    4. Create a logic to switch to the tab where Etsy.com is open
    5. Assert: Title contains “Etsy”
    Lines to be pasted:
    ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    These lines will simply open new tabs using something called JavascriptExecutor
    and get those pages. We will learn JavascriptExecutor later as well.
     */


    @Test
    public void windowHandleTest(){
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

//        Set<String>windowHandles = driver.getWindowHandles();
//        for(String windowHandle : windowHandles){
//
//            driver.switchTo().window(windowHandle);
//            System.out.println("Each name of the window is "+windowHandle);
//
//            if(driver.getCurrentUrl().toLowerCase().contains("google")){
//                break;
//            }
//        }


       // BrowserUtilities.switchWindowAndValidate(driver,"Etsy.com","Etsy");
        BrowserUtilities.switchToWindow(driver,"etsy");
    }

}