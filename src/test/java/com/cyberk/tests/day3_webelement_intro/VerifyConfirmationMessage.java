package com.cyberk.tests.day3_webelement_intro;

import com.cyberk.utilities.WebDriverfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    public static void main(String[] args) {

        /**
         open browser
         go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         enter any email
         verify that email is displayed in the input box
         click on Retrieve password
         verify that confirmation message says 'Your e-mail's been sent!'
         */

        WebDriver driver = WebDriverfactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("test@gmail.com");
        String actualmail = "test@gmail.com";
        String expectedmail = email.getAttribute("value");
        System.out.println("expectedmail = " + expectedmail);
        System.out.println("actualmail = " + actualmail);
        if (actualmail.equals(expectedmail)) {
            System.out.println(" PASS email");
        } else {
            System.out.println("FAIL email"); }

            WebElement button = driver.findElement(By.id("form_submit"));
            button.click();
            WebElement text = driver.findElement(By.name("confirmation_message"));
            String actualtext = text.getText();
            String expectedtext = "Your e-mail's been sent!";
            if (actualtext.equals(expectedtext)) {
                System.out.println(" TEXT PASS");
            } else {
                System.out.println("TEXT FAIL");

                System.out.println("expectedtext = " + expectedtext);
                System.out.println("actualtext   = " + actualtext);
            }
                driver.close();
        }
    }

