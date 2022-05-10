package com.nopcommerce.demo.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
LoginPage loginPage;
    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void inIt() {
loginPage = new LoginPage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully() {
//        Click on login link
        loginPage.clickOnLogIn();
//verify that "Welcome, Please Sign In!" message display
String expected = "Welcome, Please Sign In!";
String actual = loginPage.verifyWelcome();
        Assert.assertEquals(actual,expected,"not displayed");
    }

    @Test(priority = 1,groups = {"smoke","sanity","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        //Click on login link
        loginPage.clickOnLogIn();
        //Enter EmailId
        loginPage.enterEmail("xyz123@yahoo.com");
        //Enter Password
        loginPage.enterPassWord("xyz123");
        //Click on Login Button
        loginPage.clickOnLogInButan();
        //Verify that the Error message
        String expectedRes = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualRes = loginPage.verifyErrorMessage();
        Assert.assertEquals(actualRes,expectedRes,"not found");

    }
    @Test(priority = 2,groups = {"smoke","regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        //Click on login link
        loginPage.clickOnLogIn();
        //Enter EmailId
        loginPage.enterEmail("xyz123@yahoo.com");
        //Enter Password
        loginPage.enterPassWord("xyz123");
        //Click on Login Button
        loginPage.clickOnLogInButan();
        //Verify that LogOut link is display
    }

    @Test(priority = 3,groups = {"regression","sanity"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
//    Click on login link
        loginPage.clickOnLogIn();
//    Enter EmailId
        loginPage.enterEmail("markpaul@yahoo.com");
//    Enter Password
        loginPage.enterPassWord("mark12paul");
//    Click on Login Button
        loginPage.clickOnLogInButan();

    }
}