package ua.com.vitech.internal.sample.devflow.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.vitech.internal.sample.devflow.core.domain.User;
import ua.com.vitech.internal.sample.devflow.core.repositories.UserRepository;
import ua.com.vitech.internal.sample.devflow.core.services.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User logUser(User user) {
       User lastUserRequest = userRepository.findByUsername(user.getUsername())
               .orElseGet(User::new);
        userRepository.save(user);
        return lastUserRequest;
    }

    @Override
    public User getByUserName(String userName) {
        return userRepository.findByUsername(userName).get();
    }
}
