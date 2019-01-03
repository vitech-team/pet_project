package ua.com.vitech.internal.sample.devflow.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
