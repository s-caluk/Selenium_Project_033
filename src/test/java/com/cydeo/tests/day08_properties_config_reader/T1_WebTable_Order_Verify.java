package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
/**
 * TC #1: Web table practice
 * 1. Go to: https://practice.cydeo.com/web-tables
 * 2. Verify Bob’s name is listed as expected.
 * Expected: “Bob Martin”
 * 3. Verify Bob Martin’s order date is as expected
 * Expected: 12/31/2021
 */
public class T1_WebTable_Order_Verify {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Create new test and make setups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_verify_name_test(){
        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        //table[@class='SampleTable']/tbody/tr[7]/td[2] --> locati siteden bulduk

        WebElement bobsCell = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[2]"));
        System.out.println("bobsCell = " + bobsCell);
        System.out.println("bobsCell.getText() = " + bobsCell.getText());

        String expectedName = "Bob Martin";
        String actualName = bobsCell.getText();

        Assert.assertEquals(actualName, expectedName, "Names are not matching!");

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021

        //WebElement bobsOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[5]"));
        //WebElement bobsOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/../td[5]"));
        WebElement bobsOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));

        //Expected: 12/31/2021
        String expectedDate = "12/31/2021";
        String actualDate = bobsOrderDate.getText();

        Assert.assertEquals(actualDate, expectedDate);

    }

    @Test
    public void test2_use_order_verify_method(){

        //call the utility method we created
        String alexandraGray = WebOrderUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("alexandraGray = " + alexandraGray);

        String bartFisher = WebOrderUtils.returnOrderDate(driver, "Bart Fisher");
        System.out.println("bartFisher = " + bartFisher);


    }

    @Test
    public void test3(){

        WebOrderUtils.orderVerify(driver, "Bob Martin", "12/31/2021");

    }




}

