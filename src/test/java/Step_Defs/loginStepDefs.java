package Step_Defs;

import SeleniumConfig.SeleniumDriverConfig;
import com.sparta.jlb.bbcSite.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class loginStepDefs {

    SeleniumDriverConfig seleniumDriverConfig = new SeleniumDriverConfig("chrome");
    BbcSite bbcSite = new BbcSite(seleniumDriverConfig.getDriver());

    @Given("^I am able to access the sign in page$")
    public void i_am_able_to_access_the_sign_in_page() throws Throwable {
        bbcSite.bbcSignInPage().goToSignInPage();
        Assert.assertEquals(bbcSite.bbcSignInPage().getSignInPageURL(), bbcSite.getCurrentURL());
    }

    @When("^I use incorrect credentials to login$")
    public void i_use_incorrect_credentials_to_login() throws Throwable {
        bbcSite.bbcSignInPage().inputUserName("email@email.com");
        bbcSite.bbcSignInPage().inputPassword("password1");
        bbcSite.bbcSignInPage().clickSubmitButton();
    }

    @Then("^I receive a viable error$")
    public void i_receive_a_viable_error() throws Throwable {
        Assert.assertNotNull(bbcSite.bbcSignInPage().getPasswordErrorText());
    }
}
