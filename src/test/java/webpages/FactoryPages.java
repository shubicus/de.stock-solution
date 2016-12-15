package webpages;

import org.openqa.selenium.WebDriver;


public class FactoryPages {

    private WebDriver webDriver;

    public FactoryPages(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage_Header homePage_Header() {
        return new HomePage_Header(webDriver);
    }

    public HomePage_Login homePage_Login() {
        return new HomePage_Login(webDriver);
    }

    public ShopPage_MainContainer shopPage_mainContainer() {
        return new ShopPage_MainContainer(webDriver);
    }

    public ShopPage_Header shopPage_header() {
        return new ShopPage_Header(webDriver);
    }

    public ProductPage_MainContainer productPage_mainContainer() {
        return new ProductPage_MainContainer(webDriver);
    }

}
