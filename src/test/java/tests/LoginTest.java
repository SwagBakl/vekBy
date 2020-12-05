package tests;

import Content.Pages.AuthorizedPage;
import Content.Pages.RegistrationPage;
import Content.Pages.UnAuthorizePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void vekLoginTest() {
        UnAuthorizePage unAuthorizePage = new UnAuthorizePage();
        RegistrationPage registrationPage = new RegistrationPage();
        AuthorizedPage authorizedPage = new AuthorizedPage();

        unAuthorizePage.pressAccountButton();
        unAuthorizePage.pressSignInButton();

        registrationPage.enterEmail("");
        registrationPage.enterPassword("");
        registrationPage.pressSignInButton();

        Assert.assertTrue(authorizedPage.isPresent(), "You has not been authorized!");
    }
}
