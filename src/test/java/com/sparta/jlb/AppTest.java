package com.sparta.jlb;

import static org.junit.Assert.assertTrue;

import SeleniumConfig.SeleniumDriverConfig;
import com.sparta.jlb.bbcSite.BbcSite;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue()
    {
        SeleniumDriverConfig seleniumDriverConfig = new SeleniumDriverConfig("edge");
        BbcSite bbcSite = new BbcSite(seleniumDriverConfig.getDriver());
        bbcSite.bbcSignInPage().goToSignInPage();
    }
}
