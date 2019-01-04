package ua.com.vitech.internal.sample.devflow;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWithChrome extends PageObject implements Login {

  @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div/form/div[1]/input")
  WebElement username;

  @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div/form/div[2]/input")
  WebElement password;

  @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div/form/input[3]")
  WebElement signInButton;

  public LoginWithChrome(WebDriver driver){
    super(driver);
  }

   @Override
   public void typeLoginAndPassword(){
    username.sendKeys("ui.test.run");
    password.sendKeys("Qwerty1@");
  }

  @Override
  public HelloWorldPage pressSubmitButton() {
     signInButton.submit();
     WebDriver driver = getDriver();
     return new HelloWorldPage(driver);
  }

}
