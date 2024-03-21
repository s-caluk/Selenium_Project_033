package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {

    public static void main(String[] args) throws InterruptedException {
        //TC #2: Back and forth navigation
        //1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list.
        driver.findElement(By.linkText("A/B Testing")).click();

        /*  bu da olur
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();
        */

        //4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }
        Thread.sleep(2000);

        //5- Go back to home page by using the .back();
        driver.navigate().back();


        //6- Verify title equals:
        //Expected: Practice
        expectedTitle = "Practice";        // zaten vardi , üzerine yazar
        actualTitle = driver.getTitle();   //aktuel sayfasinin title getirir.

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }
        Thread.sleep(2000);

        driver.close();

    }

}
