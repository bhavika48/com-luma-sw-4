package com.luma.sw.testsuits;

import com.luma.sw.pages.BottomsPage;
import com.luma.sw.pages.HomePage;
import com.luma.sw.pages.OverNightDufflePage;
import com.luma.sw.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class
MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    BottomsPage bottomsPage = new BottomsPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();


    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homePage.mouseHoverMenMenu();
        homePage.mouseHoverOnBottoms();
        homePage.selectPants();
        bottomsPage.mouseHoverOnCronusYogaPant();
        bottomsPage.selectSize32();
        //‘You added Cronus Yoga Pant to your shopping cart.’
        String expMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = bottomsPage.getTextAddedPantsToYoutCart();
        Assert.assertEquals(actualMessage, expMessage);
        overNightDufflePage.selectShoppingCart();
        String expMessage1 = "Cronus Yoga Pant";
        String actualMessage1 = bottomsPage.getTextAddedPantsToYoutCart();
        Assert.assertEquals(actualMessage1, expMessage1);
        String expMessage2 = "32";
        String actualMessage2 = bottomsPage.gettextToCheckSizeOfProduct();
        Assert.assertEquals(actualMessage2, expMessage2);
        String expMessage3 = "Black";
        String actualMessage3 = bottomsPage.getTextToCheckColourOfProduct();
        Assert.assertEquals(actualMessage3, expMessage3);

    }
}
