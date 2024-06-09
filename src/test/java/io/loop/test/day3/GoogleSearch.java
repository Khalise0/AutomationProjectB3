package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {   /*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the brower
 */
    public static void main(String[] args) {

        // in selenium lower then 21 we need to set up driver, for that we need webdrivermanager libraries

        //WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        String expectedTitle = "Google";

        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle+ ", matches expected title: " + expectedTitle +
                    ". => TEST PASS");
        }  else {
            System.out.println("Actual title: " + actualTitle + ", DOES NOT MATCH expected title: " + expectedTitle + ". => TEST FAIL");
        }

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.google.com";

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Actual URL: " + actualUrl + " matches expected URL: " + expectedUrl + ". => TEST PASS");
        }else{
            System.out.println("Actual URL: " + actualUrl + " does not  matches expected URL: " + expectedUrl + ". => TEST FALL");
        }

        driver.quit();




    }
}
