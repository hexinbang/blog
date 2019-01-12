package com.blog.service;
import com.blog.entity.User;
import com.blog.vo.UserVo;

import java.util.Map;


public interface UserService {
    /**
     * 查看用户空间
     * @param userId
     * @return
     */
    Map<String,Object> getUserRoom(int userId);

    /**
     * 添加用户
     * @param userVo
     * @return
     */
    int insertUser(UserVo userVo);

    /**
     * 登陆查找用户
     * @param userVo
     * @return
     */
    User findUser(UserVo userVo);

    /**
     * 获取token
     * @param user
     * @return
     */
    String createToken(User user);
}
