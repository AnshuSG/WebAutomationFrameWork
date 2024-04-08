package org.SG.tests;

import org.SG.Pages.PageObjectModel.DashBoardPage_POM;
import org.SG.Pages.PageObjectModel.LoginPage_POM;
import org.SG.baseTest.CommonToAllTest;
import org.SG.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testVWOLoginPOMBaseTest extends CommonToAllTest {
    @Test(groups= {"smoke"},priority = 1)
    public void testLoginNegative(){
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String ErrorMsgText = loginPagePom.testLoginwithInvalidCreds();
        Assert.assertEquals(ErrorMsgText,"Your email, password, IP address or location did not match");

        Assertions.assertThat(ErrorMsgText )
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readkey("error_message"));
    }



    @Test(priority = 2)
    public void testLoginPositive(){
        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        loginPagePom.testLoginwithvalidCreds();
      DashBoardPage_POM dashboardpagePOM =  loginPagePom.afterLoginVWOValidCreds();
      String expected_username = dashboardpagePOM.LoggedinUserName();
      Assert.assertEquals(expected_username, PropertyReader.readkey("expected_username"));


    }
}
