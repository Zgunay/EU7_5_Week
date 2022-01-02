package com.cyberk.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChercherTest {
    WebDriver driver; // declare our reference for the object
    @BeforeMethod
    public void setUp(){
        driver = com.cybertek.utilities.WebDriverFactory.getDriver("chrome"); // create the object
        driver.manage().window().maximize();
        // implicitly wait, this is going to be applied to whole test cases and elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
    driver.close();

    }

    @Test

    public void alertPresentTest() {

    }


}
