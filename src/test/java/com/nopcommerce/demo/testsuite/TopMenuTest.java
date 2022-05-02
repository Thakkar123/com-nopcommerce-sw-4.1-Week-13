package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homepage = new HomePage();

    @Test
    public void navigateToComputerPageAndVerifyText()
    {
        homepage.selectMenu("Computers");
        String actualMessage = homepage.getTextFromComputers();
        Assert.assertEquals(actualMessage,"Computers","error");
    }
    @Test
    public void navigateToElectronicsPageAndVerifyText()
    {
        homepage.selectMenu("Electronics");
        String actualMessage = homepage.getTextFromElectronics();
        Assert.assertEquals(actualMessage,"Electronics","error");
    }
    @Test
    public void navigateToApparelPageAndVerifyText()
    {
        homepage.selectMenu("Apparel");
        String actualMessage = homepage.getTextFromApparel();
        Assert.assertEquals(actualMessage,"Apparel","error");
    }
    @Test
    public void navigateToDigitalDownloadsPageAndVerifyText()
    {
        homepage.selectMenu("Digital downloads");
        String actualMessage = homepage.getTextFromDigitalDownloads();
        Assert.assertEquals(actualMessage,"Digital downloads","error");
    }
    @Test
    public void navigateToBooksPageAndVerifyText()
    {
        homepage.selectMenu("Books");
        String actualMessage = homepage.getTextFromBooks();
        Assert.assertEquals(actualMessage,"Books","error");
    }
    @Test
    public void navigateToJewelryPageAndVerifyText()
    {
        homepage.selectMenu("Jewelry");
        String actualMessage = homepage.getTextFromJewelry();
        Assert.assertEquals(actualMessage,"Jewelry","error");
    }
    @Test
    public void navigateToGiftCardsPageAndVerifyText()
    {
        homepage.selectMenu("Gift Cards");
        String actualMessage = homepage.getTextFromGiftCards();
        Assert.assertEquals(actualMessage,"Gift Cards","error");
    }

}
