package com.cyberk.tests.day3_webelement_intro;

import com.cyberk.utilities.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {

    public static void main(String[] args) {

        /**
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */

        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("test@test.com");


        // click on Retrieve password
        WebElement retrivePasswordButton = driver.findElement(By.id("form_submit"));
        retrivePasswordButton.click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        if(currentUrl.equals("http://practice.cybertekschool.com/email_sent")){
            System.out.println("PASS" );
        } else {
            System.out.println("FAIL" );
        }

    }
}
