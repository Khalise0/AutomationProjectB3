package io.loop.test.day3;

import io.loop.test.utilities.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_css {
    /*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"
     */
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String actual = logo.getAttribute("alt");
        System.out.println("docuport = " + actual);


        if(DocuportConstants.LOGO_DOCUPORT.equals(actual)){
            System.out.println("Expected docuport = " + DocuportConstants.LOGO_DOCUPORT + " matches with actual " + actual);
            System.out.println("TEST PASSED");
        }else{
            System.err.println("Expected docuport = " + DocuportConstants.LOGO_DOCUPORT + " does not matches with actual " + actual);
            System.err.println("TEST FAILED");
        }
    }
}
