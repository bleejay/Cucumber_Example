package com.sparta.jlb.bbcSite.bbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcSignInPage {

    //setup driver
    private WebDriver driver;
    //Set page path
    private String signInPageURL = "https://account.bbc.com/signin";
    //Page object identifier
    private By userNameFieldID = By.id("user-identifier-input");
    private By passwordFieldID = By.id("password-input");
    private By submitButtonID = By.id("submit-button");
    private By incorrectPasswordErrorID = By.id("form-message-password");

    public BbcSignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSignInPage(){
        driver.navigate().to(signInPageURL);
    }

    public void inputUserName(String username){
        driver.findElement(userNameFieldID).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordFieldID).sendKeys(password);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButtonID).click();
    }

    public String getPasswordErrorText(){
        return driver.findElement(incorrectPasswordErrorID).getText();
    }

    //helper method
    public String getSignInPageURL() {return signInPageURL;}
}
