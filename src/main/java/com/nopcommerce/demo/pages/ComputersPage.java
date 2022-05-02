package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    By desktopCategory = By.xpath("//img[@alt='Picture for category Desktops']");

    public void clickOnDesktopCategory(){

        clickOnElement(desktopCategory);
    }

}
