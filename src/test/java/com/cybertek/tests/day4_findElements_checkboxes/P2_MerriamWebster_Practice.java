package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P2_MerriamWebster_Practice {

    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        driver.manage().window().maximize();

        //implicit wait used by findElement method to have additional time when
        //not able to find element immediately
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //3. Print out the texts of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));



        //4. Print out how many link is missing text
        //5. Print out how many link has text
        //6. Print out how many total link
    }

}