package com.luma.sw.testsuits;


import com.luma.sw.pages.BagsPage;
import com.luma.sw.pages.HomePage;
import com.luma.sw.pages.JacketsPage;
import com.luma.sw.pages.OverNightDufflePage;
import com.luma.sw.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HomeTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    JacketsPage jacketsPage = new JacketsPage();


    @Test
    public void verifyTheSortByProductNameFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.selectJackets();
        jacketsPage.sortByProductName();
        ArrayList<String> actualProductsName = jacketsPage.getActualProductsNameByOrder();
        ArrayList<String> expectedProductsName = jacketsPage.getProductsNameByAscendingOrder();
        Assert.assertEquals(actualProductsName,expectedProductsName);

    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        homePage.mouseHoverOnGear();
        homePage.selectBags();
        bagsPage.selectOvernightDuffle();
        String expectedMessage = "Overnight Duffle";
        String actualMessage = bagsPage.getTextOvernightDuffle();
        Assert.assertEquals(expectedMessage, actualMessage);
        bagsPage.addQuantity();
        bagsPage.selectOvernightDuffleAddToCart();
        String expectedMessage1 = "You added Overnight Duffle to your shopping cart.";
        String actualMessage1 = overNightDufflePage.getTextOvernightDuffle();
        Assert.assertEquals(expectedMessage1, actualMessage1);
        overNightDufflePage.selectShoppingCart();
        overNightDufflePage.getTextCronusYogaPant();
        //* Verify the Qty is ‘3’
        String expectedMessage3 = "3";
        String actualMessage3 = overNightDufflePage.getTextOfQuantityThree();
        Assert.assertEquals(actualMessage3, expectedMessage3);
        //* Verify the product price ‘$135.00’
        String expectedMessage4 = "$135.00";
        String actualMessage4 = overNightDufflePage.getTextOfPrice$13500();
        Assert.assertEquals(actualMessage4, expectedMessage4);
        //* Change Qty to ‘5’
        overNightDufflePage.addQuantityTo5();
        overNightDufflePage.selectShoppingCart();
        //* Verify the product price ‘$225.00’
        String expectedMessage5 = "$225.00";
        String actualMessage5 = overNightDufflePage.getPrice$22500();
        Assert.assertEquals(actualMessage5, expectedMessage5);

    }
    @Test
    public void verifyTheSortByPriceFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.selectJackets();
        jacketsPage.sortByPrice();
        ArrayList<String> actualPrice = jacketsPage.getActualProductsPriceByOrder();
        ArrayList<String> expectedPrice = jacketsPage.getProductsPriceByAscendingOrder();
        Assert.assertEquals(actualPrice,expectedPrice);






    }


}


