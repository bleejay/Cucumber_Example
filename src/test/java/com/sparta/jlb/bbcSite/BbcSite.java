package com.sparta.jlb.bbcSite;

import com.sparta.jlb.bbcSite.bbcPages.BbcHomePage;
import com.sparta.jlb.bbcSite.bbcPages.BbcSignInPage;
import org.openqa.selenium.WebDriver;

public class BbcSite {

    private WebDriver driver;
    private BbcHomePage bbcHomePage;
    private BbcSignInPage bbcSignInPage;


    public BbcSite(WebDriver driver) {
        this.driver = driver;
        bbcHomePage = new BbcHomePage(driver);
        bbcSignInPage = new BbcSignInPage(driver);
    }

    //Helper Methods
    public void quit(){
        driver.quit();
    }
    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    //Page Accessors
    public BbcHomePage bbcHomePage(){
       return bbcHomePage;
    }
    public BbcSignInPage bbcSignInPage(){
        return bbcSignInPage;
    }

}
