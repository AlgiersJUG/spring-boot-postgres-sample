package org.jug.algeria.controller;

import org.jug.algeria.domain.User;
import org.jug.algeria.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@RestController
public class HomeController {

    public static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Inject
    private UserRepository userRepository;

    @RequestMapping(value = "/user/{username}", method = RequestMethod.POST)
    public User createUser(@PathVariable String username) {
        logger.info("Creation of a new user ...");
        final User user = new User(username);
        final User save = userRepository.save(user);
        logger.info("Creation of a new user done");
        return save;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findAllUsers() {
        logger.info("Find all users within DB");
        final List<User> resultList = new ArrayList<>();
        final Iterable<User> all = userRepository.findAll();
        all.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                resultList.add(user);
            }
        });
        return resultList;
    }

}
