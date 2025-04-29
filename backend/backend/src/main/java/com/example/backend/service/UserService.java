package com.example.backend.service;

import com.example.backend.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
    void deleteUser(Long id);

}
