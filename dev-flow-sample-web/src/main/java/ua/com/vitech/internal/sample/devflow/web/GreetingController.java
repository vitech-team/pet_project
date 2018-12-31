package ua.com.vitech.internal.sample.devflow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.vitech.internal.sample.devflow.core.domain.User;
import ua.com.vitech.internal.sample.devflow.core.services.UserService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.Date;


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
