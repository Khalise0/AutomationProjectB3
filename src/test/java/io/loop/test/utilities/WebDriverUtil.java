package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverUtil {

    /**
     * @param browserType
     * @return the driver of that brother
     * @author nsh
     */
   public static WebDriver getDriver(String browserType){

       if(browserType.equalsIgnoreCase("Chrome")){
           return new ChromeDriver();
       } else if(browserType.equalsIgnoreCase("Firefox")){
           return new FirefoxDriver();
       } else if(browserType.equalsIgnoreCase("Safari")){
           return new SafariDriver();
       } else{

           System.out.println("No driver found");
           System.out.println("Driver is null");
           return null;
       }

   }
}
