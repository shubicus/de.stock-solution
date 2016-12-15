package helpers;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import webpages.FactoryPages;


public class Login {

    public void login(WebDriver webDriver, FactoryPages factoryPages) {

        UserData userData = new UserData();

        factoryPages.homePage_Header().getShop_WebElement().click();

        factoryPages.homePage_Login().getUsernameTextBox_WebElement().clear();
        factoryPages.homePage_Login().getUsernameTextBox_WebElement().sendKeys(userData.getUsername());

        factoryPages.homePage_Login().getPasswordTextBox_WebElement().clear();
        factoryPages.homePage_Login().getPasswordTextBox_WebElement().sendKeys(userData.getPassword());

        factoryPages.homePage_Login().getLoginButton_WebElement().submit();

        Assert.assertEquals(webDriver.getCurrentUrl(), "http://uat.stock-solution.de/en/shop");
    }

}
