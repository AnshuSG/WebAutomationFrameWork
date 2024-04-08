package org.SG.Pages.PageObjectModel;

import org.SG.base.CommonToAllPage;
import org.openqa.selenium.By;

public class DashBoardPage_POM  extends CommonToAllPage {

    public DashBoardPage_POM(){

    }

//Page Locators
By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    //Page Actions
    public String LoggedinUserName(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }





}
