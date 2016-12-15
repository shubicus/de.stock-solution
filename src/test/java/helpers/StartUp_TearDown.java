package helpers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utility.ListenerEvent;
import webpages.FactoryPages;

public abstract class StartUp_TearDown {

    private WebDriver webDriver;
    private FactoryPages factoryPages;
    private WebDriverWait wait;
//    private EventFiringWebDriver eventFiringWebDriver;
//    private ListenerEvent listenerEvent;


    @BeforeClass
    public void setUp() {

        webDriver = Browsers.CHROME.create();
        factoryPages = new FactoryPages(webDriver);
        wait = new WebDriverWait(getWebDriver(), 10, 500);

//        eventFiringWebDriver = new EventFiringWebDriver(webDriver);
//        listenerEvent = new ListenerEvent();
//        eventFiringWebDriver.register(listenerEvent);

        webDriver.get("http://uat.stock-solution.de/en");

    }


    @AfterClass
    public void tearDown() {
        if (webDriver != null)
            webDriver.close();
    }


    public FactoryPages getFactoryPages() {
        return factoryPages;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

//    public EventFiringWebDriver getEventFiringWebDriver() {
//        return eventFiringWebDriver;
//    }
}
