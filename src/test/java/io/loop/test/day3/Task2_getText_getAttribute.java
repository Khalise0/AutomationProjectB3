package io.loop.test.day3;

import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_getText_getAttribute {
    public static void main(String[] args) {

         /*
    go to url: https://loopcamp.vercel.app/registration_form.html
    verify header text expected:  Registration form
    verify placeholder attribute value expected - username
     */

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();

        if(actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected error message: " + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + ", matches actual error message: " + actualHeaderForForm + ". => TEST PASS");
        } else {
            System.err.println("Expected error message: " + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + ", not matches actual error message: " + actualHeaderForForm + ". => TEST FAIL");
        }

        WebElement userNamePlaceholder = driver.findElement(By.name("firstname"));
        String actualPlaceholderForUsername = userNamePlaceholder.getAttribute("placeholder");

        if(actualPlaceholderForUsername.equals(LoopCampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME)){
            System.out.println("Expected placeholder matches actual. TEST PASSED");
        }else{
            System.err.println("Expected placeholder DOES NOT  matches actual. TEST FAILED ");
        }


        driver.quit();
    }
}
