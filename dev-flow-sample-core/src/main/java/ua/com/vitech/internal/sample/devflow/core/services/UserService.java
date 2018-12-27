package ua.com.vitech.internal.sample.devflow.core.services;

import ua.com.vitech.internal.sample.devflow.core.domain.User;

public interface UserService {

    User logUser(User user);

    User getByUserName(String userName);
}
