package com.tcs.user.service;

import com.tcs.user.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getUsers();

    User getUser(Long id);

    User saveUser(User user);
}
