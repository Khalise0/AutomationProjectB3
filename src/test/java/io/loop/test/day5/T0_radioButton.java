package io.loop.test.day5;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T0_radioButton {


    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");

        //selenium4 and after

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));
        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));

        //isSelected()

        System.out.println("red.isSelected() BEFORE CLICKING " + red.isSelected());
        red.click();

        System.out.println("green.isSelected() BEFORE CLICKING " + green.isSelected());
        green.click();

        //isEnabled()
        System.out.println("red.isEnabled() AFTER CLICKING " + red.isSelected());

        System.out.println("red.isEnabled() AFTER CLICKING " + red.isSelected());


    }
}
