package com.ford.POM;

import com.ford.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "")
    public WebElement name;
}
