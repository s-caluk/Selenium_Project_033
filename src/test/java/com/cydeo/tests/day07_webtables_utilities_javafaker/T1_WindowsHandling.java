package com.cydeo.tests.day07_webtables_utilities_javafaker;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

//TC #1: Window Handle practice
//1. Create new test and make setups
//2. Go to:https://www.amazon.com
//3. Copy paste the lines from below into your class
//4. Create a logic to switch to the tab where Etsy.com is open
//5. Assert:Title contains “Etsy”
//Lines to be pasted:
//((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
//((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
//((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
//These lines will simply open new tabs using something called JavascriptExecutor and get those pages.
// We will learn JavascriptExecutor later as well.
public class T1_WindowsHandling {
}
