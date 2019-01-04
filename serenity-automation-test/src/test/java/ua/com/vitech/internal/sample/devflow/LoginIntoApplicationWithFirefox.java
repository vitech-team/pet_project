package ua.com.vitech.internal.sample.devflow;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(SerenityRunner.class)
public class LoginIntoApplicationWithFirefox {

  @Managed(driver = "firefox")
  WebDriver driver;

  @Test
  public void logIn(){
    driver.get("http://localhost:8080");
    Login loginPage = new LoginWithFirefox(driver);
    loginPage.typeLoginAndPassword();
    HelloWorldPage helloWorldPage = loginPage.pressSubmitButton();
    System.out.println(helloWorldPage.h1.getText());
    assertEquals(helloWorldPage.h1.getText(), "Hello world");
  }

  @After
  public void closeDriver() {
    driver.quit();
  }

}
