package ua.com.vitech.internal.sample.devflow.web;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final String loginRedirectUrl;

    public LoginController(
        @Value
            ("${spring.security.oauth2.client.registration.cognito-client-1.redirectUrl}")
            String loginRedirectUrl
    ) {
        this.loginRedirectUrl = loginRedirectUrl;
    }

    @RequestMapping("/login")
    public void login(HttpServletResponse httpServletResponse)
        throws IOException {
        httpServletResponse.sendRedirect(loginRedirectUrl);
    }

}
