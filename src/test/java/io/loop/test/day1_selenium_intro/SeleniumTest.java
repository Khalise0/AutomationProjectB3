package io.loop.test.day1_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

//Setting up the web driver
    //WebDriverManager.chromedriver().setup(); but we do not need with selenium 4.21
    //If you use older version then you need dependency for webdrivermanager - bonin garsia
public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    //maximize the window
    driver.manage().window().maximize();
    // or
    //driver.manage().window().fullscreen();  <--- that not working on all operating systems


    //navigate to the web page
    driver.get("https://www.loopcamp.io");
    Thread.sleep(5000);
    driver.navigate().to("https://www.etsy.com");

    //navigate back
    driver.navigate().back();

    //navigate forward
    driver.navigate().forward();

    //refresh
    driver.navigate().refresh();

    //quit close
    driver.close();//close same session
    driver.quit();

}

}
