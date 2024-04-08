package org.SG.Pages.PageObjectModel;

import org.SG.base.CommonToAllPage;
import org.SG.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM extends CommonToAllPage {

    WebDriver driver;
    public LoginPage_POM(){
          super();
    }

    //Page LOcators  s
  By username = By.id("login-username");
  By Password = By.id("login-password");

  By signinbutton = By.id("js-login-btn");
  By error_msg = By.id("js-notification-box-msg");






    //Page Actions

    public String testLoginwithInvalidCreds()  {
        EnterInput(username, PropertyReader.readkey("username"));
        EnterInput(Password,"admin");
        ClickElement(signinbutton);
        presenceOfElement(error_msg);
        visibilityOfElement(error_msg);
        return getElement(error_msg).getText();

    }



    public void testLoginwithvalidCreds()  {
        EnterInput(username, PropertyReader.readkey("username"));
        EnterInput(Password, PropertyReader.readkey("password"));
        ClickElement(signinbutton);
    }


    public DashBoardPage_POM afterLoginVWOValidCreds(){
        return new DashBoardPage_POM();
    }






}
