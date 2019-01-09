package com.blog.controller;

import com.blog.dao.UserDao;
import com.blog.entry.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserConlroller {
    private UserDao userDao;
    @Autowired
    private UserService userService;
    @RequestMapping("/FindUser")
    public User FindUser(@RequestBody User user){
        return userService.FindUser(user);
    }
}
