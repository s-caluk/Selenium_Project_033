package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TC #2 Upload Test
 * 1. Go to https://practice.cydeo.com/upload
 * 2. Find some small file from your computer, and get the path of it.
 * 3. Upload the file.
 * 4. Assert:
 * -File uploaded text is displayed on the page
 */
public class T2_Upload_Practice {

    @Test
    public void uploading_test(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\User\\Desktop\\file.txt";
        //dosyada sagklik>eigenschaft>sicherheit>pathi kopyala
         /*
        Windows path option #1: C:\\Users\\hayat\\Desktop\\note.txt
        Windows path option #2: C://Users/hayat/Desktop/note.txt
         */

        //3. Upload the file. Use sendKeys() method and pass the "path" as a String.
        WebElement chooseFileButton = Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(2);
        chooseFileButton.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed(), "Header text is not displayed");


    }
}
