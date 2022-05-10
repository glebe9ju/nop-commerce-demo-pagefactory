package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwn;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramSelect;
    @FindBy(xpath = "//label[@for='product_attribute_3_6']")
    WebElement hddSelect320;
    @FindBy(xpath = "//label[@for='product_attribute_3_7']")
    WebElement hddSelect400;
    @FindBy(xpath = "//label[@for='product_attribute_4_8']")
    WebElement vistaHome;
    @FindBy(xpath = "//label[@for='product_attribute_4_9']")
    WebElement vistaPremium;
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li//label")
    List<WebElement> softList;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addCart;
    @FindBy(xpath = "//p[@class='content']")
    WebElement shoppingCartVerify;

    public void clickOnBuildYourOwn() {
        Reporter.log("build your own" + buildYourOwn .toString());
        clickOnElement(buildYourOwn);
    }

    public void selectProcessor(String process) {
        Reporter.log("select process" + process + "to process" + processor);
        selectByVisibleTextFromDropDown(processor, process);
    }

    public void selectRam(String ram) {
        Reporter.log("select ram" + ram + "to process" + ramSelect);
        selectByVisibleTextFromDropDown(ramSelect, ram);
    }

    public void selectHdd(String hdd) {
        Reporter.log("select hddram" + hdd + "to hdd" + hddSelect320);
        if (hddSelect320.getText().equalsIgnoreCase(hdd)) {
            clickOnElement(hddSelect320);
        } else if (hddSelect400.getText().equalsIgnoreCase(hdd)) {
            clickOnElement(hddSelect400);

        }
    }

    public void selectOs(String os) {
        if (vistaHome.getText().equalsIgnoreCase(os)) {
            clickOnElement(vistaHome);
        } else if (vistaPremium.getText().equalsIgnoreCase(os)) {
            clickOnElement(vistaPremium);
        }
    }

    public void selectSoftware(String soft) {
        for (WebElement softEl : softList) {
            if (softEl.getText().equalsIgnoreCase(soft)) {
                clickOnElement(softEl);
                break;
            }
        }
    }

    public void clickOnAddToCart() {
        clickOnElement(addCart);
    }

    public String verifyShoppingCart() {
        return getTextFromElement(shoppingCartVerify);
    }


}
