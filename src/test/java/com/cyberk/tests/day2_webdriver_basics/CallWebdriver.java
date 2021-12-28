package com.cyberk.tests.day2_webdriver_basics;

import com.cyberk.utilities.WebDriverfactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class CallWebdriver {

    public static void main(String[] args) {

        WebDriver driver= WebDriverfactory.getDriver("fireworks");
        driver.get("http://practice.cybertekschool.com");

    }
}
