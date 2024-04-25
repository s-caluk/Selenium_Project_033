package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TC #3: Hover Test
 * 1. Go to https://practice.cydeo.com/hovers
 * 2. Hover over to first image
 * 3. Assert:
 * a. “name: user1” is displayed
 * 4. Hover over to second image
 * 5. Assert:
 * a. “name: user2” is displayed
 * 6. Hover over to third image
 * 7. Confirm:
 * a. “name: user3” is displayed
 */
public class T3_Actions_Hover {

    @Test
    public void hovering_test() {

        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //Locate all the images here
        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locate all the "user" headers here
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(image1).perform(); //elementin üzerine gelmis gibi...
        Assert.assertTrue(user1.isDisplayed());

        action.moveToElement(image2).perform();
        Assert.assertTrue(user2.isDisplayed());

        action.moveToElement(image3).perform();
        Assert.assertTrue(user3.isDisplayed());
    }
}
