package ua.com.vitech.internal.sample.devflow.web;

import javax.servlet.http.HttpServletResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {

    @Mock
    private HttpServletResponse response;

    @Test
    public void testLogin() throws Exception {
        final String redirectUrl = "http://myurl";
        new LoginController(redirectUrl).login(response);
        Mockito.verify(response).sendRedirect(redirectUrl);
    }
}
