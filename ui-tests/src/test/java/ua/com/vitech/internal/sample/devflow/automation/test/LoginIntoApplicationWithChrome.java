package ua.com.vitech.internal.sample.devflow.automation.test;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SerenityRunner.class)
public class LoginIntoApplicationWithChrome {

    private static final transient Logger LOGGER = LoggerFactory.getLogger(LoginIntoApplicationWithChrome.class);
    private String baseUrl;

    @Managed(driver = "chrome", options = "")
    WebDriver driver;

    /**
     * sets fake base url.
     */
    @Before
    public void setUp() {
        baseUrl = System.getenv("IT_BASE_URL");
        LOGGER.info("IT Base URL = {}", baseUrl);
        if (baseUrl == null) {
            baseUrl = "http://localhost:8080";
        }
    }

    @Test
    public void logIn() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
        Login loginPage = new LoginWithChrome(driver);
        loginPage.typeLoginAndPassword();
        HelloWorldPage helloWorldPage = loginPage.pressSubmitButton();
        assertEquals("Hello world", helloWorldPage.h1.getText());
    }


    @After
    public void closeDriver()  {
        driver.quit();
    }

}
