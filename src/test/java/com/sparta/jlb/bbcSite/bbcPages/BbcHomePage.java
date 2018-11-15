package com.sparta.jlb.bbcSite.bbcPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcHomePage {

    private WebDriver driver;

    private String homePageURL = "https://www.bbc.co.uk";

    private By signInLinkID = By.id("idcta-link");

    public BbcHomePage (WebDriver driver){
        this.driver = driver;
    }

    public void goToHomePage(){
        driver.navigate().to(homePageURL);
    }
    public void clickSIgnInLink(){
        driver.findElement(signInLinkID).click();
    }

}
