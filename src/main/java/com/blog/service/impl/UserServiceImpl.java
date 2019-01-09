package com.blog.service.impl;

import com.blog.dao.UserDao;
import com.blog.entry.User;
import com.blog.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;
   public  User FindUser(User user){
       return userDao.FindUser(user);
   }
}

