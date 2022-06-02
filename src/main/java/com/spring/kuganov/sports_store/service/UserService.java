package com.spring.kuganov.sports_store.service;

import com.spring.kuganov.sports_store.entity.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
