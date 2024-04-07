package org.SG.tests;

import org.SG.Pages.PageObjectModel.LoginPage_POM;
import org.SG.baseTest.CommonToAllTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testVWOLoginPOMBaseTest extends CommonToAllTest {
    @Test
    public void testLoginNegative(){
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String ErrorMsgText = loginPagePom.testLoginwithInvalidCreds();
        Assert.assertEquals(ErrorMsgText,"Your email, password, IP address or location did not match");
    }
}
