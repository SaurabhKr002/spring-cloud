package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImp implements UserService{

    List<User> list = List.of(
            new User(1L, "John", "1234567890"),
            new User(2L, "Sam", "1234567890"),
            new User(3L, "Tom", "1234567890")
    );

    @Override
    public User getUser(Long Id) {
        return list.stream().filter(user -> user.getUserId().equals(Id)).findAny().orElse(null);
    }

}
