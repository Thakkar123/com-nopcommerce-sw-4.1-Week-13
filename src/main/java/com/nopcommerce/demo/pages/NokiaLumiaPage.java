package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumiaPage extends Utility {

    By nokiaLumia1020Text = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By priceText = By.xpath("//span[contains(text(),'$349.00')]");
    By cartQuantityBox = By.id("product_enteredQuantity_20");
    By addToCartButton = By.id("add-to-cart-button-20");
    By productBeenAddedText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By greenCloseButton = By.xpath("//span[@title='Close']");
    By shoppingCartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");

    public String getNokiaLumia1020Text(){
        return getTextFromElement(nokiaLumia1020Text);
    }
    public String getPriceText(){
        return getTextFromElement(priceText);
    }
    public void updateQuantityBox(){
        sendTextToElement(cartQuantityBox,Keys.BACK_SPACE + "2");
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public String getProductBeenAddedText(){
        return getTextFromElement(productBeenAddedText);
    }
    public void clickOnGreenCloseButton(){
        clickOnElement(greenCloseButton);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCartLink);
    }
    public void clickOnGoToCartButton(){
        clickOnElement(goToCartButton);
    }
}
