package ua.com.vitech.internal.sample.devflow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.vitech.internal.sample.devflow.core.domain.User;
import ua.com.vitech.internal.sample.devflow.core.repositories.UserRepository;
import ua.com.vitech.internal.sample.devflow.core.services.UserService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.Date;
import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    UserService userService;

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

    @RequestMapping("/user")
    public User getUsers(Principal principal, HttpRequest httpRequest){
        System.out.println(httpRequest);
        User user = new User();
        user.setUsername(principal.getName());
        user.setDateOfVisit(new Date());
        user.setRequestUrl("request url");
        return userService.logUser(user);
    }
}
