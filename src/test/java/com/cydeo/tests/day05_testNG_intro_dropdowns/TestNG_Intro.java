package com.cydeo.tests.day05_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass() {
        System.out.println("----->beforeClass is running");
    }

    @AfterClass
    public void teardownClass() {
        System.out.println("----->afterClass is running");
    }
    @BeforeMethod
    public void setupMethod() {
        System.out.println("-->beforeMethod is running");
    }

    @AfterMethod
    public void teardownMethod() {
        System.out.println("-->afterMethod is running");
    }
    @Test ( priority = 2 )
    public void test1() {
        System.out.println("test1 is running");

        //Assert Equals method will compare two of the same values. If returns true, pass. False, fails.
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);
    }

    @Test ( priority = 1 )
    public void test2() {
        System.out.println("test2 is running");

        String actual = "white";
        String expected = "white";

        Assert.assertTrue(actual.equals(expected));
    }
}
