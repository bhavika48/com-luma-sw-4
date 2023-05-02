package com.luma.sw.pages;


import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
   public void mouseHoverOnWomenMenu(){
       mouseHoverToElement(By.xpath("//span[normalize-space()='Women']"));
   }
    public void mouseHoverOnTops(){
       ////span[text()='Women']//span[text()='Tops']
        mouseHoverToElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]"));

    }
    public void selectJackets(){
        clickOnElement(By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"));
    }
    public void mouseHoverOnGear(){
        mouseHoverToElement(By.xpath("//span[normalize-space()='Gear']"));

    }
    public void selectBags(){
        clickOnElement(By.xpath("//span[contains(text(),'Bags')]"));
    }
    public void mouseHoverMenMenu() {
        mouseHoverToElement(By.xpath("//a[@id='ui-id-5']"));
    }
    public void mouseHoverOnBottoms() {
        mouseHoverToElement(By.linkText("Bottoms"));
    }
    public void selectPants(){
        clickOnElement(By.xpath("//a[contains(text(),'Pants')]"));
    }


}
