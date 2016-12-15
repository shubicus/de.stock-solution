package webpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Header {

    private WebDriver webDriver;

    @FindBy(xpath = ".//a[@class='brand-logo']/img")
    private WebElement logo_WebElement;

    @FindBy(linkText = "OUR CONCEPT")
    private WebElement ourConcept_WebElement;

    @FindBy(linkText = "SHOP")
    private WebElement shop_WebElement;

    @FindBy(linkText = "JOBS")
    private WebElement jobs_WebElement;

    @FindBy(linkText = "CONTACT")
    private WebElement contact_WebElement;

    @FindBy(xpath = ".//a[@class='dropdown-button']")
    private WebElement languages_WebElement;

    public HomePage_Header(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getLogo_WebElement() {
        return logo_WebElement;
    }

    public WebElement getOurConcept_WebElement() {
        return ourConcept_WebElement;
    }

    public WebElement getShop_WebElement() {
        return shop_WebElement;
    }

    public WebElement getJobs_WebElement() {
        return jobs_WebElement;
    }

    public WebElement getContact_WebElement() {
        return contact_WebElement;
    }




}

