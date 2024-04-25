package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;

/**
 * TC #1: Bing search
 * 1- Open a chrome browser
 * 2- Go to: https://bing.com
 * 3- Write “apple” in search box
 * 4- Verify title:
 *
 * Expected: apple - Search
 *
 * Use `configuration.properties` for the following:
 * 1. The browser type
 * 2. The URL
 * 3. The search keyword
 * 4. Make title verification dynamic. If search value changes, title
 * assertion should not fail.
 */
public class T1_Bing_Search {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://bing.com");
        driver.get(ConfigurationReader.getProperty("bingURL"));
        driver.findElement(By.xpath("//a[.='Akzeptieren']")).click();

    }
    @Test
    public void bing_search_test() {

        //3- Write “apple” in search box

        //locate the search box
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        //Expected: flowers - Search
        String actualTitle = driver.getTitle();

        //String expectedTitle = "apple - Search";
        //We are just making the expectedTitle dynamic based on the text we are searching.
        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Search";

        Assert.assertFalse(actualTitle.equals(expectedTitle));


    }


}
