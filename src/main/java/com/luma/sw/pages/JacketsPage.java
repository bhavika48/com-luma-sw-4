package com.luma.sw.pages;

import com.luma.sw.utilities.Utility;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;

public class JacketsPage extends Utility {

public void selectProductsByFilters(){
    selectByVisibleTextFromDropDown(By.id("sorter"), "Product Name");
}

    public ArrayList<String> getProductsNameByAscendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//ol//strong//a"));
        Collections.sort(products);
        return products;
    }
    public ArrayList<String> getActualProductsNameByOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//ol//strong//a"));
        return products;
    }
    public ArrayList<String> getProductsPriceByAscendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//div[@class='products wrapper grid products-grid']//span[@class='price']"));
        Collections.sort(products);
        return products;
    }
    public ArrayList<String> getActualProductsPriceByOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//div[@class='products wrapper grid products-grid']//span[@class='price']"));
        return products;
    }
    public void sortByProductName(){
        selectByVisibleTextFromDropDown(By.id("sorter"), "Product Name");
    }
    public void sortByPrice(){
        selectByVisibleTextFromDropDown(By.id("sorter"), "Price ");
    }

}
