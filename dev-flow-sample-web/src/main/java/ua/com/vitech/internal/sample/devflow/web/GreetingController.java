package ua.com.vitech.internal.sample.devflow.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(Principal principal) {
        return "Hello " + principal.getName();
    }

    @RequestMapping("/public")
    public String publicPage() {
        return "public page";
    }

    @RequestMapping("/login")
    public void login(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendRedirect("/oauth2/authorization/cognito-client-1");
    }
}
