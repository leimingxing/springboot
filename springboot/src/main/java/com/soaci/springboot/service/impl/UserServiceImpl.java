package com.soaci.springboot.service.impl;

import com.soaci.springboot.entity.User;
import com.soaci.springboot.mapper.UserMapper;
import com.soaci.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public Integer insertUser(User user) {
        Integer integer = userMapper.insertUser(user);
        return integer;
    }

    @Override
    public Integer batchInsertUser(List<User> users) {
        Integer integer = userMapper.batchInsertUser(users);
        return integer;
    }

    @Override
    public User deleteUser(Integer id) {
        User user = userMapper.deleteUser(id);
        return user;
    }

    @Override
    public User updateUser(User user) {
        User user1 = userMapper.updateUser(user);
        return user1;
    }

    @Override
    public User seleteUser(Integer id) {
        User user = userMapper.seleteUser(id);
        return user;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> users = userMapper.selectAllUser();
        return users;
    }

    @Override
    public List<User> selectUserByName(String name) {
        List<User> users = userMapper.selectUserByName(name);
        return users;
    }
}
