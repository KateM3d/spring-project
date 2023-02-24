package com.project.projectusers.service;

import com.project.projectusers.models.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private List<User> users = new ArrayList<>();

    public UserServiceImpl() {
        users.add(new User(1, "John"));
        users.add(new User(2, "Jane"));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
