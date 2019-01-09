package ua.com.vitech.internal.sample.devflow.automation.test;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SerenityRunner.class)
public class LoginIntoApplicationWithChrome {

    private static final transient Logger LOGGER = LoggerFactory.getLogger(LoginIntoApplicationWithChrome.class);
    private String baseUrl;

    @Managed(driver = "chrome")
    WebDriver driver;

    /**
     * sets fake base url.
     */
    @Before
    public void setUp() {
        baseUrl = System.getenv("IT_BASE_URL");
        LOGGER.info("IT Base URL = {}", baseUrl);
    }

    @Test
    public void logIn() {
        System.out.println(baseUrl);
        driver.get(baseUrl);
        Login loginPage = new LoginWithChrome(driver);
        loginPage.typeLoginAndPassword();
        HelloWorldPage helloWorldPage = loginPage.pressSubmitButton();
        System.out.println(helloWorldPage.h1.getText());
        assertEquals(helloWorldPage.h1.getText(), "Hello world");
    }


    @After
    public void closeDriver()  {
        driver.quit();
    }

}
