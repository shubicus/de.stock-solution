package helpers;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum Browsers {

    CHROME {
        public WebDriver create() {
            ChromeDriverManager.getInstance().setup();
            return new ChromeDriver();
        }
    },
    IE {
        public WebDriver create() {
            InternetExplorerDriverManager.getInstance().setup();
            return new InternetExplorerDriver();
        }
    },
    FIREFOX {
        public WebDriver create() {
            FirefoxDriverManager.getInstance().setup();
            return new FirefoxDriver();
        }
    };

    public WebDriver create() {
        return null;
    }

}
