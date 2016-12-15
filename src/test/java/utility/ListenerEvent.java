package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


public class ListenerEvent extends AbstractWebDriverEventListener {


    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Navigate to: " + s);
    }


    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Looking for: " + webElement);
    }


    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Clicking on: " + webElement);
    }


    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("Some problem: " + throwable);
    }
}
