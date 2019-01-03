package ua.com.vitech.internal.sample.devflow.web;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.vitech.internal.sample.devflow.core.domain.User;
import ua.com.vitech.internal.sample.devflow.core.services.UserService;

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

}
