package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computer;
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerVerify;
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopVerify;

    public void clickOnCoputer() {
        clickOnElement(computer);
    }

    public String verifyComputers() {
        return getTextFromElement(computerVerify);
    }

    public void clickOnDesktop() {
        clickOnElement(desktop);
    }

    public String verifyDesktop() {
        return getTextFromElement(desktopVerify);
    }


}


