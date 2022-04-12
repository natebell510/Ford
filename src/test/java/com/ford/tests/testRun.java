package com.ford.tests;

import com.ford.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class testRun {
    @Test
    public void check_google(){
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Selenium"));
        Driver.closeDriver();

    }

}
