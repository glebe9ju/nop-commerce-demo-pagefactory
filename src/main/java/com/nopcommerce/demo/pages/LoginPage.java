package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement logIn;
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welCome;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement eMail;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passWord;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logInButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorInMessage;


    public void clickOnLogIn(){
        clickOnElement(logIn);
    }
public String verifyWelcome(){
        return getTextFromElement(welCome);
}
public void enterEmail(String email){
        sendTextToElement(eMail,email);
}
public void enterPassWord(String pass){
        sendTextToElement(passWord,pass);
}
public void clickOnLogInButan(){
        clickOnElement(logInButton);
}
public String verifyErrorMessage(){
        return getTextFromElement(errorInMessage);
}


}
