package com.ford.tests;

import com.ford.utilities.ConfigurationReader;
import com.ford.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class testRun {
    @Test
    public void check_google(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));


    }

    

}
