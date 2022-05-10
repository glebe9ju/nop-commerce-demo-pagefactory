package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt() {
        computerPage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }
    @Test(priority = 1, groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        //Click on Computer tab
        computerPage.clickOnCoputer();
        //Verify "Computer" text
        String expected = "Computers";
        String actual = computerPage.verifyComputers();
        Assert.assertEquals(actual,expected,"not displayed");
    }
@Test(priority = 2, groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //Click on Computer tab
    computerPage.clickOnCoputer();
    //Click on Desktops link
    computerPage.clickOnDesktop();
    //Verify "Desktops" text
    String expected = "Desktops";
    String actual = computerPage.verifyDesktop();
    Assert.assertEquals(actual,expected,"not found");
}
@Test(priority = 3,dataProvider = "buildYourComputer",dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String
                  processor, String ram, String hdd, String os, String software){
        //Click on Computer tab
    computerPage.clickOnCoputer();
    //Click on Desktops link
    computerPage.clickOnDesktop();
    //Click on product name "Build your own computer"
    buildYourOwnComputerPage.clickOnBuildYourOwn();
    //Select processor "processor"
    buildYourOwnComputerPage.selectProcessor(processor);
    //Select RAM "ram"
    buildYourOwnComputerPage.selectRam(ram);
    //Select HDD "hdd"
    buildYourOwnComputerPage.selectHdd(hdd);
    //Select OS "os"
    buildYourOwnComputerPage.selectOs(os);
    //Select Software "software"
    buildYourOwnComputerPage.selectSoftware(software);
    //Click on "ADD TO CART" Button
    buildYourOwnComputerPage.clickOnAddToCart();
    //Verify message "The product has been added to your shopping cart"
    String expected = "The product has been added to your shopping cart";
            String actual = buildYourOwnComputerPage.verifyShoppingCart();
    Assert.assertEquals(actual,expected,"not found");
}
}
