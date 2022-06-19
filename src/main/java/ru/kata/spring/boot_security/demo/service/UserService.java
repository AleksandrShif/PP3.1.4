package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;
import java.util.Set;

public interface UserService extends UserDetailsService {

    void add(User user);
    void delete(User user);
    List<User> listUsers();
    User getUserById(long id);
    User getUserByUsername(String username);
    void update(User user);
}
