package com.beyza.main;

import com.beyza.config.AppConfig;
import com.beyza.model.User;
import com.beyza.services.LoginService;
import com.beyza.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        for(User user : userService.getUserList()){
            System.out.println(user);
        }
        LoginService loginService = new LoginService();
        loginService.login();



  /*      UserService userservice1 = new UserService();
        List<User> userList = new ArrayList<>();
        userList.add(new User("beyzanur"));
        userList.add(new User("feyza"));

        userservice1.setUserList(userList);

       // UserService userservice2 = new UserService();
        //burda gidip tekrar bi userservice oluşturunca öncekiler de gidiyor bunun yerine bir kere newle ve onları contexte at ihtiyac oldukca git contexten cagır

*/

    }
}
