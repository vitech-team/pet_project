package ua.com.vitech.internal.sample.devflow.web;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
    /**
     *
     * @param principal
     * @return
     */
    @RequestMapping("/greeting")
    public String greeting(Principal principal) {
        System.out.println("greeting");
        return "Hello " + principal.getName();

    }

    @RequestMapping("/public")
    public String publicPage() {
        System.out.println("public call");
        return "public page";
    }
// Comment
//    @RequestMapping("/login")
}
