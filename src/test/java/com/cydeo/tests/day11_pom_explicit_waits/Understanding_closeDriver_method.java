package com.cydeo.tests.day11_pom_explicit_waits;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Understanding_closeDriver_method {
    // Driver.getDriver().quit() / close() sadece 1. test geciyor.
    //Driver.closeDriver(); --> her 3 testi de calistiriyor
    @Test
    public void test1(){
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.xpath("//div[.='Alle akzeptieren']")).click();
        //Driver.getDriver().quit();
        //Driver.getDriver().close();
        Driver.closeDriver();
    }
    @Test
    public void test2(){
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.xpath("//div[.='Alle akzeptieren']")).click();
        Driver.closeDriver();
    }
    @Test
    public void test3(){
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.xpath("//div[.='Alle akzeptieren']")).click();
        Driver.closeDriver();
    }
}
