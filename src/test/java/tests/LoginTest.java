package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void projectShouldBeCreated() {
        loginPage
                .openPage()
                .login("xanofey212@devncie.com", "hIF({:}js5qTvt+");
        productsPage.projectExist();
    }
}
