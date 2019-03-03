package com.blog.service.impl;


import com.blog.dao.EssayDao;
import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.service.UserService;
import com.blog.util.TokenUtil;
import com.blog.vo.UserVo;
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
    @Autowired
    RegisterService registerService;

    public Map<String,Object> getUserRoom(int userId){
        Map map=new HashMap();
        map.put("user",userDao.getUserById(userId));
        map.put("essay",essayDao.getEssayByUserId(userId));
        return map;
    }

    @Override
    public int insertUser(UserVo userVo) {
        if(registerService.getValidateCodeIds(userVo.getUsername(),userVo.getCode()))
        return userDao.insertUser(userVo);
        return 0;
    }

    @Override
    public User findUser(UserVo userVo) {
        return userDao.findUser(userVo);
    }

    @Override
    public String createToken(User user) {
        if(user!=null){
            try {
                return TokenUtil.CreateToken(user);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int updateUserByAdmin(UserVo userVo) {
        return userDao.updateUserByAdmin(userVo);
    }

    @Override
    public int updateUserByUser(UserVo userVo) {
        return userDao.updateUserByUser(userVo);
    }

    @Override
    public List<User> searchUserByKey(String keyWord) {
        if(keyWord!=null)
        return userDao.searchUserByKey(keyWord);
        return null;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }


}

