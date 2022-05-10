package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true,groups = {"sanity","smoke","regression"})
    public void inIt() {
        registerPage = new RegisterPage();

    }

    @Test(priority = 1,groups = {"regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register Link
        registerPage.clickOnRegister();
        //Click on "REGISTER" button
        registerPage.clickOnRegister();

    }

    @Test(priority = 2,groups = {"sanity","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() throws InterruptedException {
        //Click on Register Link
        registerPage.clickOnRegister();
        //Click on "REGISTER" button
        registerPage.clickOnRegisterTitle();
        //enter first name
        registerPage.enterFirstName("Methew");
        //Verify the error message "First name is required."
        String expected5 = "First name is required.";
        String actual5 = registerPage.verifyFirstNameRequired();
        Assert.assertEquals(actual5, expected5, "not found");
        Thread.sleep(2000);
        //enter last name
        registerPage.enterLastName("Paul");
        //Verify the error message "Last name is required."
        String expectedRes = "Last name is required.";
        String actualRes = registerPage.verifyLastNameRequired();
        Assert.assertEquals(actualRes, expectedRes, "not found");
        //enter email
        registerPage.enterEmail("mar12k@gmail.com");
        //Verify the error message "Email is required."
        String expectedResult = "Email is required.";
        String actualResult = registerPage.verifyEmailRequired();
        Assert.assertEquals(actualResult, expectedResult, "not found");
        Thread.sleep(2000);
        //enter password
        registerPage.enterPssWord("mark123");
        //Verify the error message "Password is required."
        String expected1 = "Password is required.";
        String actual1 = registerPage.verifyPasswordRequired();
        Assert.assertEquals(actual1, expected1, "not found");
        //enter confirm password
        registerPage.enterConfPass("mark123");
        //Verify the error message confirm "Password is required.
        String expected2 = "Password is required.";
        String actual2 = registerPage.verifyConfirmPass();
        Assert.assertEquals(actual2, expected2, "not found");
        //click on register buttion
        registerPage.clickOnRegiButton();

    }

    @Test(priority = 3,groups = {"regression","smoke"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        //Click on Register Link
        registerPage.clickOnRegister();
        //Select gender "Female"
        registerPage.selectGender("Female");
        //Enter firstname
        registerPage.enterFirstName("Methew");
        //Enter lastname
        registerPage.enterLastName("Paul");
        //Select day
        registerPage.selectDateOfBirth("5");
        //Select month
        registerPage.selectDateOfMonth("April");
        //Select year
        registerPage.selectDateOfYer("1969");
        //Enter email
        registerPage.enterEmail("mar12k@gmail.com");
        //Enter password
        registerPage.enterPssWord("mark123");
        //Enter Confirm Password
        registerPage.enterConfPass("mark123");
        //Click on "REGISTER" button
        registerPage.clickOnRegiButton();
        //Verify message "Your registration completed"
        String expected = "Your registration completed";
        String actual = registerPage.verifyRegister();
        Assert.assertEquals(actual, expected, "not found");
    }

}
