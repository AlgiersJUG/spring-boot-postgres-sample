package org.jug.algeria.repository;

import org.jug.algeria.domain.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MockUserRepository {
    public User save(User user) {
        return new User(1000L, "Abderrazak BOUADMA");
    }

    public Iterable<User> findAll() {
        return Arrays.asList(new User[]{new User(1000L, "Abderrazak BOUADMA"),new User(2000L, "Maria BOUADMA")});
    }
}
