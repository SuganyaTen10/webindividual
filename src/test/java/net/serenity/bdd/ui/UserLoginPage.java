package net.serenity.bdd.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserLoginPage extends PageObject {

    @FindBy(name ="ctl00$MainContent$Email")
    WebElement txtUser;

    @FindBy(name ="ctl00$MainContent$Password")
    WebElement txtPsd;

    @FindBy(name ="ctl00$MainContent$ctl05")
    WebElement btnLogin;


    public void loginDetails(String username, String password) {
        txtUser.sendKeys(username);
        txtPsd.sendKeys(password);
        btnLogin.click();
    }
}
