package ua.com.vitech.internal.sample.devflow.core.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;
import ua.com.vitech.internal.sample.devflow.core.domain.User;
import ua.com.vitech.internal.sample.devflow.core.repositories.UserRepository;
import ua.com.vitech.internal.sample.devflow.core.services.impl.UserServiceImpl;

import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.not;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {


    @Mock
    private UserRepository userRepository;

    @InjectMocks
    @Spy
    private UserServiceImpl userService;

    @Test
    public void logUserTest(){
        User userToFind = new User();
        userToFind.setId(1L);
        userToFind.setUsername("Vlad");
        userToFind.setRequestUrl("/user");
        userToFind.setDateOfVisit(new Date());

        User lastUserRequest = new User();
        userToFind.setId(1L);
        lastUserRequest.setUsername("Vlad");
        lastUserRequest.setRequestUrl("/user");
        lastUserRequest.setDateOfVisit(new Date());
        when(userRepository.findByUsername(userToFind.getUsername())).thenReturn(Optional.of(lastUserRequest));
        BeanUtils.copyProperties(userToFind, lastUserRequest, "id");
        assertEquals(userService.logUser(userToFind), lastUserRequest);
    }

    @Test
    public void logUserFirsTime() {
        User userToFind = new User();
        userToFind.setId(1L);
        userToFind.setUsername("Vlad");
        userToFind.setRequestUrl("/user");
        userToFind.setDateOfVisit(new Date());

        User lastUserRequest = new User();

        when(userRepository.findByUsername(userToFind.getUsername())).thenReturn(Optional.of(lastUserRequest));
        BeanUtils.copyProperties(userToFind, lastUserRequest, "id");
        assertEquals(userService.logUser(userToFind), lastUserRequest);
    }

}
