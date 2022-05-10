package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerTitle;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequired;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequired;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailAdd;
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequired;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passWord;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequired;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confiPass;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPass;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement regiButton;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleGender;
//    @FindBy(xpath = "//input[@id='gender-male']")
//    WebElement maleGender;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirth;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement dateOfMonth;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement dateOfYear;
    @FindBy(xpath = "//div[@class='result']")
    WebElement registerComp;

    public void clickOnRegister() {
        clickOnElement(register);
    }
    public void clickOnRegisterTitle() {
        clickOnElement(registerTitle);
    }
    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }
    public String verifyFirstNameRequired() {
        return getTextFromElement(firstNameRequired);
    }
    public void enterLastName(String last) {
        sendTextToElement(lastName, last);
    }
    public String verifyLastNameRequired() {
        return getTextFromElement(lastNameRequired);
    }
public void enterEmail(String email){
        sendTextToElement(emailAdd,email);
}
    public String verifyEmailRequired() {
        return getTextFromElement(emailRequired);
    }
public void enterPssWord(String pass){
        sendTextToElement(passWord,pass);
}
    public String verifyPasswordRequired() {
        return getTextFromElement(passwordRequired);
    }
public void enterConfPass(String pass){
        sendTextToElement(confiPass,pass);
}
    public String verifyConfirmPass() {
        return getTextFromElement(confirmPass);
    }
public void clickOnRegiButton(){
        clickOnElement(regiButton);
}
public void selectGender(String female){
        clickOnElement(femaleGender);
}
public void selectDateOfBirth(String date){
        selectByVisibleTextFromDropDown(dateOfBirth,date);
}
public void selectDateOfMonth(String month){
        selectByVisibleTextFromDropDown(dateOfMonth,month);
}
public void selectDateOfYer(String year){
        selectByVisibleTextFromDropDown(dateOfYear,year);
}
public String verifyRegister(){
        return getTextFromElement(registerComp);
}

}
