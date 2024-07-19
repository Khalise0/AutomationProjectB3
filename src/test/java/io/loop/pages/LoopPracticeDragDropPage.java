package io.loop.pages;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDragDropPage {

    public LoopPracticeDragDropPage() {

        PageFactory.initElements(Driver.getDriver(),this);
        // PageFactory.initElements is - Method from Selenium from 'PageFactory' class. Function is connect webelement bellow with real elements on the web-page
        //Driver.getDriver() gives current WebDriver which we are using to search elements on web-page
        // this points on LoopPracticeDragDropPage class
    }

    @FindBy(xpath = "1//div[@id='draggable']")
    public WebElement smallCircle;

    @FindBy(id = "droptarget")
    public WebElement bigCircle;


}
