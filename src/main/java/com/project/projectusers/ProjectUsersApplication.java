package com.project.projectusers;

import com.project.projectusers.models.User;
import com.project.projectusers.service.UserService;
import com.project.projectusers.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjectUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectUsersApplication.class, args);
    }
    @Bean
    public UserService userService() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John"));
        users.add(new User(2, "Jane"));
        return new UserServiceImpl(users);
    }
}
