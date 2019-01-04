package ua.com.vitech.internal.sample.devflow.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.vitech.internal.sample.devflow.core.domain.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    Optional<User> findByUsername(String username);

}
