package ua.com.vitech.internal.sample.devflow;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelloWorldPage extends PageObject {

    @FindBy(tagName = "h1")
    WebElement h1;

    HelloWorldPage(WebDriver webDriver) {
        super(webDriver);
    }



}
