package com.ford.tests;

import com.ford.POM.LandingPage;
import com.ford.utilities.ConfigurationReader;
import com.ford.utilities.Driver;
import com.ford.utilities.Method;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testRun {
    LandingPage landingPage = new LandingPage();
    @Test
    public void check_google(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));



    }

    

}
