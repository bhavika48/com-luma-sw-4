package com.luma.sw.pages;

import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

public class BottomsPage extends Utility {
    public void mouseHoverOnCronusYogaPant(){
        mouseHoverToElement(By.xpath("//a[contains(text(),'Cronus Yoga Pant')]"));
    }
    public void selectSize32(){
        clickOnElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));

    }
    public String getTextAddedPantsToYoutCart(){
        return getTextFromElement(By.xpath("(//div[@role='alert']//div)[2]"));
    }
    public String getTitleCronusYogaPant(){
        return getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"));
    }
    public String gettextToCheckSizeOfProduct(){
        return  getTextFromElement(By.xpath("//dd[contains(text(),'32')]"));
    }
    public String getTextToCheckColourOfProduct(){
        return getTextFromElement(By.xpath("//dd[contains(text(),'Black')]"));
    }

}
