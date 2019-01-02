package ua.com.vitech.internal.sample.devflow.web;

import org.junit.Assert;
import org.junit.Test;

import java.security.Principal;

public class GreetingControllerTest {

    @Test
    public void testGreeting() {
        Assert.assertEquals("Hello User", new GreetingController().greeting(new Principal() {
            @Override
            public String getName() {
                return "User";
            }
        }));
    }

    @Test
    public void testPublic() {
        Assert.assertEquals("public page", new GreetingController().publicPage());
    }

}
