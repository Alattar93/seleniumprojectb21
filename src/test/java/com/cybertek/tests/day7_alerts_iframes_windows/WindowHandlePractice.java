package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handling_test(){

    }


    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}