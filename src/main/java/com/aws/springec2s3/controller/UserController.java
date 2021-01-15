package com.aws.springec2s3.controller;

import com.aws.springec2s3.model.User;
import com.aws.springec2s3.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    public List<User> findAll(){
        LOGGER.info("Hit findAll method");
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        LOGGER.info("Hit save User method");
        return userRepository.save(user);
    }
}
