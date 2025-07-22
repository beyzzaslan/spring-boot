package com.beyza.config;

import com.beyza.model.User;
import com.beyza.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public UserService userService(){
        UserService userservice = new UserService();
        List<User> userList = new ArrayList<>();
        userList.add(new User("beyzanur"));
        userList.add(new User("feyza"));

        userservice.setUserList(userList);
        return userservice;

    }
}
