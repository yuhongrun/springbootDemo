package com.example.demo.service;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hongrun.yu
 * @date 2018-08-16 9:36
 */
public interface UserService {
    List<User> getAllUsers();
    List<User> getUserById(@Param("id") Integer id);
    void updateUserEmailById(@Param("id") Integer id);
    void deleteUserById(@Param("id") Integer id);
    void insertUser(User user);

}
