package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
getText() and getAttribute() method practice
 */
public class T5_getText_getAttribute {
    public static void main(String[] args) {
        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //Expected: Registration form

        WebElement header = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = header.getText();

        if(actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("header text verification is passed");
        }else{
            System.out.println("header text verification is failed");
        }

        //4- Locate “First name” input box
        WebElement firstNameInput = driver.findElement(By.className("form-control"));

        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name
        String expectedPlaceholderText = "first name";

        String actualPlaceholderText = firstNameInput.getAttribute("placeholder");
        System.out.println("actualPlaceHolder = " + actualPlaceholderText);

        if(actualPlaceholderText.equals(expectedPlaceholderText)) {
            System.out.println("placeholder text verification is passed");
        }else{
            System.out.println("placeholder text verification is failed");
        }


        driver.quit();

    }
}
