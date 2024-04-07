package org.SG.tests;


import org.SG.Pages.PageObjectModel.LoginPage_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testVWOLoginPOM {


    @Test
    public void testLoginNegative(){
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String ErrorMsgText = loginPagePom.testLoginwithInvalidCreds();
        Assert.assertEquals(ErrorMsgText,"Your email, password, IP address or location did not match");



    }
}
