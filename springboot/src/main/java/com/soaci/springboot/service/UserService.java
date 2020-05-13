package com.soaci.springboot.service;

import com.soaci.springboot.entity.User;

import java.util.List;

public interface UserService {

    Integer insertUser(User user);
    Integer batchInsertUser(List<User> users);
    User deleteUser(Integer id);
    User updateUser(User user);
    User seleteUser(Integer id);
    List<User> selectAllUser();

    List<User> selectUserByName(String name);
}
