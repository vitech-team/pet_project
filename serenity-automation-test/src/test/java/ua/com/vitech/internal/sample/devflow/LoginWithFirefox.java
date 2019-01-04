package ua.com.vitech.internal.sample.devflow;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWithFirefox extends PageObject implements Login {

  @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[1]/input")
  WebElement username;

  @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/div[2]/input")
  WebElement password;

  @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div/form/input[3]")
  WebElement signInButton;


  public LoginWithFirefox(WebDriver driver) {
      super(driver);
  }

  @Override
  public void typeLoginAndPassword() {
    username.sendKeys("ui.test.run", Keys.RETURN);
    password.sendKeys("Qwerty1@", Keys.RETURN);
  }

  @Override
  public HelloWorldPage pressSubmitButton() {
    WebDriver driver = getDriver();
    return new HelloWorldPage(driver);
  }
}
