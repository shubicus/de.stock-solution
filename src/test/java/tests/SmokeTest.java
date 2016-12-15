package tests;


import helpers.Login;
import helpers.StartUp_TearDown;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.UtilityForScreenshot;


public class SmokeTest extends StartUp_TearDown {

    Login login = new Login();


    @Test
    public void login() {

        login.login(getWebDriver(), getFactoryPages());
        Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://uat.stock-solution.de/en/shop");
        UtilityForScreenshot.captureScreenshot(getWebDriver(), "Login");

    }

}
