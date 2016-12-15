package webpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Login {

    private WebDriver webDriver;

    @FindBy(id = "username")
    private WebElement usernameTextBox_WebElement;

    @FindBy(id = "password")
    private WebElement passwordTextBox_WebElement;

    @FindBy(id = "_submit")
    private WebElement loginButton_WebElement;

    public HomePage_Login(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getUsernameTextBox_WebElement() {
        return usernameTextBox_WebElement;
    }

    public WebElement getPasswordTextBox_WebElement() {
        return passwordTextBox_WebElement;
    }

    public WebElement getLoginButton_WebElement() {
        return loginButton_WebElement;
    }
}
