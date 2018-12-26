package ua.com.vitech.internal.sample.devflow.web;

import org.junit.Assert;
import org.junit.Test;

public class GreetingControllerTest {

    @Test
    public void testGreeting() {
        Assert.assertEquals("Hello", new GreetingController().greeting());
    }

}
