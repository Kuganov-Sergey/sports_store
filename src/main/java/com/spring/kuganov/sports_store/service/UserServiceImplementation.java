package com.spring.kuganov.sports_store.service;

import com.spring.kuganov.sports_store.dao.UserRepository;
import com.spring.kuganov.sports_store.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        User user = null;
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            user = optionalUser.get();
        }

        /*
               Выбрасывать исключение или записывать в лог
         */
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
