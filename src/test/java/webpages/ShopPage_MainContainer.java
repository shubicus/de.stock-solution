package webpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class ShopPage_MainContainer {

    private WebDriver webDriver;

    @FindBys({@FindBy(linkText = "VIEW")})
    private List<WebElement> allVIEW_WebElements;

    public ShopPage_MainContainer(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public List<WebElement> getAllVIEW_WebElements() {
        return allVIEW_WebElements;
    }
}
