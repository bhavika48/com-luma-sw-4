package com.luma.sw.pages;

import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDufflePage extends Utility {
    public String getTextOvernightDuffle(){
        return getTextFromElement(By.xpath("//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]"));
    }
    public void selectShoppingCart(){
        clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
    }
    public String getTextCronusYogaPant(){
      return  getTextFromElement(By.xpath("//tbody[1]/tr[1]/td[1]/div[1]/strong[1]/a[1]"));
    }
    public String getTextOfQuantityThree(){
       return getTextFromElement(By.xpath("//input[@id='cart-106590-qty']"));
    }
    public String getTextOfPrice$13500(){
        return getTextFromElement(By.xpath("//span[contains(text(),'$135.00')]"));
    }
    public void addQuantityTo5(){
        sendTextToElement(By.xpath("//input[@id='cart-106590-qty']"), "5");
    }
    public String getPrice$22500(){
       return getTextFromElement(By.xpath("//span[contains(text(),'$225.00')]"));
    }




}
