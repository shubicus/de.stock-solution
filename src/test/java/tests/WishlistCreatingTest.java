package tests;


import helpers.Login;
import helpers.StartUp_TearDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;


public class WishlistCreatingTest extends StartUp_TearDown {

    Random randomizer = new Random();
    Login login = new Login();


    @Test
    public void wishlist() {

        login.login(getWebDriver(), getFactoryPages());

        List<WebElement> view_webElements = getFactoryPages().shopPage_mainContainer().getAllVIEW_WebElements();  //collect all VIEW buttons
        int v = randomizer.nextInt(view_webElements.size());
        WebElement randomView1 = view_webElements.get(v); //choose random one
        randomView1.click(); // ...enter in chosen category

        List<WebElement> toWishlist = getFactoryPages().productPage_mainContainer().getAllVIEW_WebElements();  //collect all addToCart buttons
        int a = randomizer.nextInt(toWishlist.size()); //memorize random number
        int b = randomizer.nextInt(toWishlist.size());
        int c = randomizer.nextInt(toWishlist.size());
        WebElement product1 = toWishlist.get(a);
        WebElement product2 = toWishlist.get(b);
        WebElement product3 = toWishlist.get(c);

        List<WebElement> productNames = getWebDriver().findElements(By.xpath(".//span[@class='title title-of-article']"));  //collect all product names
        WebElement name1Element = productNames.get(a); //choose name of product
        WebElement name2Element = productNames.get(b);
        WebElement name3Element = productNames.get(c);
        String name1 = name1Element.getAttribute("innerHTML"); // get name
        String name2 = name2Element.getAttribute("innerHTML");
        String name3 = name3Element.getAttribute("innerHTML");

//----------------------------------------------------------------------------------------------------------
        product1.click();
        product2.click();
        product3.click();
        getWait().until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='toast-container']"))));

        getFactoryPages().shopPage_header().getLogoHome_WebElement().click();  // go Home page by logo
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://uat.stock-solution.de/en/shop");  // Am I on HOME page ???

        getFactoryPages().shopPage_header().getWishlist_WebElement().click();
//        Assert.assertTrue(getWebDriver().findElement(By.xpath(".//li[@class='collection-item avatar'][1]")).isDisplayed());  //Was Wishlist created ???
//        Assert.assertFalse(getWebDriver().findElement(By.xpath(".//li[@class='collection-item avatar'][2]")).isDisplayed());  //Wasn't 2 Wishlists created ???


    }

}
