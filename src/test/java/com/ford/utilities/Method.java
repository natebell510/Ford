package com.ford.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Method {
    public static List<String> getText(List<WebElement>elements){
        List<String>text = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            text.add(elements.get(i).getText());
        }
        return text;
    }
    public static void scrollTo(WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());
        js.executeScript("arguments[0].scrollIntoView()",element);
    }
    public static void hoverOn(WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
    public static void scrollBy(WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());
        js.executeScript("scrollBy(0,8000)");
    }

    public static void switchToNextWindow(){
        String mainWindow = Driver.getDriver().getWindowHandle();
        for (String windowHandle : Driver.getDriver().getWindowHandles()) {
           if(!windowHandle.equals(mainWindow)){
               Driver.getDriver().switchTo().window(windowHandle);
           }
        }
    }


}
