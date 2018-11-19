package com.blog.service.impl;

import com.blog.dao.EssayDao;
import com.blog.dao.UserDao;
import com.blog.entry.Essay;
import com.blog.entry.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    EssayDao essayDao;

    public Map<String,Object> getUserRoom(int userId){
        Map map=new HashMap();
        map.put("user",userDao.getUserById(userId));
        map.put("essay",essayDao.getEssayByUserId(userId));
        return map;
    }
}

