package com.blog.service;

<<<<<<< HEAD
import com.blog.entry.User;

public interface UserService {
    User FindUser(User user);
=======
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
>>>>>>> a12e191dbbdbb1bebea52ff00ca840e374ab3bd5
}
