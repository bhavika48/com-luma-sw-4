package com.luma.sw.pages;

import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {
    public void selectOvernightDuffle(){
        clickOnElement(By.xpath("//a[contains(text(),'Overnight Duffle')]"));
    }
    public String getTextOvernightDuffle(){
       return getTextFromElement(By.xpath("//span[contains(text(),'Overnight Duffle')]"));
    }
    public void addQuantity(){
        sendTextToElement(By.xpath("//input[@id='qty']"), "3");
    }
    public void selectOvernightDuffleAddToCart(){
        clickOnElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
    }



}
