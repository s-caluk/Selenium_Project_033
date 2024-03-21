package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_Zerobank_Header {
    public static void main(String[] args) {
        //TC #2: Back and forth navigation
        //1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = driver.findElement(By.tagName("h3")).getText();
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header verification PASSED!!!");
        }else{
            System.out.println("Header verification FAILED!!!");
        }

    }
}
