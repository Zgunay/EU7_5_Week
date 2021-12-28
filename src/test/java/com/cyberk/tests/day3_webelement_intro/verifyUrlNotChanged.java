package com.cyberk.tests.day3_webelement_intro;

import com.cyberk.utilities.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ContextClickAction;

public class verifyUrlNotChanged {

    public static void main(String[] args) {

        /**
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * click on Retrieve password
         * verify that url did not change
         */

        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedUrl = driver.getCurrentUrl();

        // click on Retrieve password
        WebElement retrivePasswordButton = driver.findElement(By.id("form_submit"));
         retrivePasswordButton.click();
        String actualUrl= driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println(" Pass");
        }else System.out.println("Fail");


    }
}
