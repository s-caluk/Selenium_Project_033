package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;


//TC #1: XPATH and cssSelector Practices
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/forgot_password
//3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//a. “Home” link
//b. “Forgot password” header
//c. “E-mail” text
//d. E-mail input box
//e. “Retrieve password” button
//f. "Powered by Cydeo" text
//4. Verify all web elements are displayed.
public class T1_xpath_cssSelector_practices {
    public static void main(String[] args) throws InterruptedException {

    //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

    //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
    //a. “Home” link (3 farkli sekilde locate etti)

        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

    //b. “Forgot password” header
        WebElement header_ex1 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header_ex3 = driver.findElement(By.cssSelector("div[class='example'] > h2"));
        WebElement header_ex4 = driver.findElement(By.cssSelector("div.example > h2"));

    //c. “E-mail” text
        WebElement emailLabel_ex1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel_ex2 = driver.findElement(By.xpath("//label[.='E-mail']"));

    //d. E-mail input box
        WebElement emailInput_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailInput_ex2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]")); //tagName[contains(@attribute, 'value')]

    //e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

    //f. "Powered by Cydeo" text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

    //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel_ex1.isDisplayed() = " + emailLabel_ex1.isDisplayed());
        System.out.println("emailInput_ex1.isDisplayed() = " + emailInput_ex1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        Thread.sleep(2000);
        driver.close();

    }



}
