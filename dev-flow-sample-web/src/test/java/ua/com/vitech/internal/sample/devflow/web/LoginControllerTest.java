package ua.com.vitech.internal.sample.devflow.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.http.HttpServletResponse;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {

    @Mock
    private HttpServletResponse response;

    @Test
    public void testLogin() throws Exception {
        final String REDIRECT_URL = "http://myurl";
        new LoginController(REDIRECT_URL).login(response);
        Mockito.verify(response).sendRedirect(REDIRECT_URL);
    }
}
