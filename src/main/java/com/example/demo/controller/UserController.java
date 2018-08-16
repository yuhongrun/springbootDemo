package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hongrun.yu
 * @date 2018-08-16 9:42
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("test");
        return mv;
    }
    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public Map<String,Object> getAllUser(){
        Map<String,Object> map=new HashMap<>();
        List<User> resultList = new ArrayList<>();
        resultList = userService.getAllUsers();
        map.put("resultList",resultList);
        return map;
    }
    @RequestMapping(value = "/getUserById/{id}",method = RequestMethod.GET)
    public List<User> getUser(@PathVariable Integer id){
        List<User> resultList = new ArrayList<>();
        resultList = userService.getUserById(id);
        return resultList;
    }

    @RequestMapping(value = "/updateUserById")
    public void updateUser(@PathVariable Integer id){
        userService.updateUserEmailById(id);
    }

    @RequestMapping(value = "/deleteUserById/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/insertUser")
    public void insertUser(){
        User user=new User();
        user.setEmail("asdasd");
        user.setName("asdasdas");
        user.setPassword("asdasd");
        userService.insertUser(user);
    }
}
