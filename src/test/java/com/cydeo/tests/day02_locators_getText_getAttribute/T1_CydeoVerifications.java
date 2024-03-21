package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
        //TC(Test Cases)
        // #1: Cydeo practice tool verifications

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3. Verify URL contains
        //Expected: cydeo
        String expectedInURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedInURL)){
            System.out.println("URL verification PASSED!!!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

        //4. Verify title:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle(); //--> returns "Practice"

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");
        }else{
            System.out.println("Title verification is FAIL!");
        }

        if(driver.getTitle().equals("Practice")){
            System.out.println("Pass!");
        }

        //close the browser
        driver.close();
    }
}
