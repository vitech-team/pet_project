package ua.com.vitech.internal.sample.devflow.core.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ua.com.vitech.internal.sample.devflow.core.domain.User;
import ua.com.vitech.internal.sample.devflow.core.repositories.UserRepository;
import ua.com.vitech.internal.sample.devflow.core.services.impl.UserServiceImpl;

import java.util.Date;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class UserServiceImplTest {

//
//    private UserService userService;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @Before
//    public void setUp(){
//        userService = new UserServiceImpl();
//    }
//
//
//    @Test
//    public void logUserTest(){
//        User user = new User();
//        user.setUsername("Vlad");
//        user.setRequestUrl("http:/localhost:8080");
//        user.setDateOfVisit(new Date());
//        User userToResturn = new User();
//        userToResturn.setUsername("Vlad");
//        userToResturn.setRequestUrl("http:/localhost:8080");
//        userToResturn.setDateOfVisit(user.getDateOfVisit());
//        when(userRepository.findByUsername(user.getUsername())).thenReturn(Optional.of(userToResturn));
//        when(userRepository.save(user));
//        assertThat(user.getUsername(), equalTo(userToResturn.getUsername()));
//    }
}
