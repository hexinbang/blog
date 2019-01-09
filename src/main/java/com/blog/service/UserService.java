package com.blog.service;

import com.blog.vo.UserVo;

import java.util.Map;

public interface UserService {
    /**
     * 查看用户空间
     * @param userId
     * @return
     */
    public Map<String,Object> getUserRoom(int userId);

    /**
     * 添加用户
     * @param userVo
     * @return
     */
    public int insertUser(UserVo userVo,String code);
}
