package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hongrun.yu
 * @date 2018-08-16 9:37
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUser();
    }

    @Override
    public List<User> getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void updateUserEmailById(Integer id) {
        userMapper.updateUserEmailById(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

}
