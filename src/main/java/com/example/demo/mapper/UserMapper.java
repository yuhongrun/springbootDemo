package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hongrun.yu
 * @date 2018-08-16 9:29
 */
@Mapper
public interface UserMapper {
    List<User> getUserById(@Param("id") Integer id);
    List<User> getAllUser();
    void updateUserEmailById(@Param("id") Integer id);
    void deleteUserById(@Param("id") Integer id);
    void insertUser(User user);
}
