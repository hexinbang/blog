package com.blog.service;

import java.util.Map;

public interface UserService {
    /**
     * 查看用户空间
     * @param userId
     * @return
     */
    public Map<String,Object> getUserRoom(int userId);
}
