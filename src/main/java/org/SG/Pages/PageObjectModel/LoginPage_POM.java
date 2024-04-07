package org.SG.Pages.PageObjectModel;

import org.SG.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM extends CommonToAllPage {

    WebDriver driver;
    public LoginPage_POM(){
          super();
    }

    //Page LOcators
  By username = By.id("login-username");
  By Password = By.id("login-password");

  By signinbutton = By.id("js-login-btn");
  By error_msg = By.id("js-notification-box-msg");






    //Page Actions

    public String testLoginwithInvalidCreds()  {
        EnterInput(username,"admin");
        EnterInput(Password,"admin");
        ClickElement(signinbutton);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getElement(error_msg).getText();

    }






}
