package webpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage_Header {

    WebDriver webDriver;

    @FindBy(id = "basket-item")
    private WebElement wishlist_WebElement;

    @FindBy(xpath = ".//a[@href='/en/profile/']")
    private WebElement profile_WebElement;

    @FindBy(id = "toggle-search")
    private WebElement search_WebElement;

    @FindBy(xpath = ".//li[@class='sign-up']/a")
    private WebElement exit_WebElement;

    @FindBy(xpath = ".//*[@id='home-btn']//a")
    private WebElement logoHome_WebElement;

    public ShopPage_Header(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getWishlist_WebElement() {
        return wishlist_WebElement;
    }

    public WebElement getProfile_WebElement() {
        return profile_WebElement;
    }

    public WebElement getSearch_WebElement() {
        return search_WebElement;
    }

    public WebElement getExit_WebElement() {
        return exit_WebElement;
    }

    public WebElement getLogoHome_WebElement() {
        return logoHome_WebElement;
    }
}
