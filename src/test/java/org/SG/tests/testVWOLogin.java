package org.SG.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testVWOLogin {


    @Test
    public void testLoginNegative(){
        WebDriver  driver =  new EdgeDriver();
   driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        Assert.assertEquals(driver.getTitle(),"Login - VWO");

        WebElement EmailInputBox = driver.findElement(By.id("login-username"));  //Page Locator
        EmailInputBox.sendKeys("admin");  // Page Action
        WebElement PasswordInputBox = driver.findElement(By.id("login-password"));
        PasswordInputBox.sendKeys("admin");
        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        String ErrorMsgText = error_msg.getText();

        String error_msg_attribute_dataqa = error_msg.getAttribute("data-qa");
        System.out.println(error_msg_attribute_dataqa);

     Assert.assertEquals(ErrorMsgText,"Your email, password, IP address or location did not match");
     driver.quit();


    }
}
