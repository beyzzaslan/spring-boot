package com.beyza.services;

import com.beyza.config.AppConfig;
import com.beyza.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoginService {
    public void login(){
        //user listesine ihtiyacım varsa
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

    }
}
