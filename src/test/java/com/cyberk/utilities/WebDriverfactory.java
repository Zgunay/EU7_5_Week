package com.cyberk.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverfactory {



    public static WebDriver getDriver(String browserType) {
        WebDriver driver = null;

        if (browserType=="chrome") {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else {
            WebDriverManager.operadriver().setup();
             driver=new OperaDriver();
        }

        return driver;
    }


}
