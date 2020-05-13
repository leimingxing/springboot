package com.soaci.springboot.mapper;

import com.soaci.springboot.entity.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    Integer insertUser(User user);
    Integer batchInsertUser(List<User> users);
    User deleteUser(Integer id);
    User updateUser(User user);
    User seleteUser(Integer id);
    List<User> selectAllUser();

    @Select("select * from user where username like concat('%',#{username},'%')")
    @ResultMap("com.soaci.springboot.mapper.UserMapper.userMap")
    List<User> selectUserByName(String username);
}
