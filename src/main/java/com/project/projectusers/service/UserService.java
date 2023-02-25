package com.project.projectusers.service;

import com.project.projectusers.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
}
