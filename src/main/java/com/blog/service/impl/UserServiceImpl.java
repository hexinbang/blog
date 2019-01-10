package com.blog.service.impl;


import com.blog.dao.EssayDao;
import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.service.UserService;
import com.blog.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    EssayDao essayDao;
    @Autowired
    RegisterService registerService;

    public Map<String,Object> getUserRoom(int userId){
        Map map=new HashMap();
        map.put("user",userDao.getUserById(userId));
        map.put("essay",essayDao.getEssayByUserId(userId));
        return map;
    }

    @Override
    public int insertUser(UserVo userVo, String code) {
        if(registerService.getValidateCodeIds(userVo.getEmail(),code))
        return userDao.insertUser(userVo);
        return 0;
    }

    @Override
    public User FindUser(UserVo userVo) {
        return userDao.FindUser(userVo);
    }


}

