package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void p2_double_click_test(){
        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        //3. Double click on the text “Double-click me to change my text color.”
        Actions actions = new Actions(Driver.getDriver());


        BrowserUtils.sleep(2);
        //using this object we can double click to any web element
        actions.doubleClick(textToDoubleClick).perform();

        //4. Assert: Text’s “style” attribute value contains “red”.
        String expected = "red";

        // will return attribute value of style
        //style="color: red;"
        String actual = textToDoubleClick.getAttribute("style");

        Assert.assertTrue(actual.contains(expected));

    }

    @AfterMethod
    public void tearDownMethod(){
        BrowserUtils.sleep(10);
        Driver.closeDriver();
    }

}
