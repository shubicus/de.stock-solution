package webpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage_MainContainer {

    private WebDriver webDriver;

    @FindBys({@FindBy(xpath = ".//a[@class='waves-effect waves-light btn light-green add-to-wishlist-btn']")})
    private List<WebElement> allVIEW_WebElements;

    @FindBy(xpath = ".//div[@text()='Article successfully added to wishlist']")
    private WebElement articleSuccessfullyAdded;


    public ProductPage_MainContainer(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public List<WebElement> getAllVIEW_WebElements() {
        return allVIEW_WebElements;
    }

    public WebElement getArticleSuccessfullyAdded() {
        return articleSuccessfullyAdded;
    }
}
