package com.blog.service.impl;

<<<<<<< HEAD
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
=======
import com.blog.dao.EssayDao;
import com.blog.dao.UserDao;
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
    public int insertUser(UserVo userVo,String code) {
        if(registerService.getValidateCodeIds(userVo.getEmail(),code))
        return userDao.insertUser(userVo);
        return 0;
    }
>>>>>>> a12e191dbbdbb1bebea52ff00ca840e374ab3bd5
}

