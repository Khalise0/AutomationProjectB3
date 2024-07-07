package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class BrowserUtilities {
    /**
     *
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author nadir
     */

    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle){
        expectedTitle = expectedTitle.toLowerCase();
        expectedUrl = expectedUrl.toLowerCase();

       //get all window handles, switch one by one and each time if the url matches expected url to stop

        Set<String> windowHandles = driver.getWindowHandles();
        for(String each : windowHandles){
            driver.switchTo().window(each);
            if(driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }
        }
       // after stopping on the expected one validate the title
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    /**
     *
     * @param driver
     * @param targetedTitle
     * @author nadir
     */

    public static void switchToWindow(WebDriver driver, String targetedTitle){
        String origin = driver.getWindowHandle();
        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if(driver.getTitle().toLowerCase().contains(targetedTitle)){
                return;
            }
        }
        driver.switchTo().window(origin);
    }

}
