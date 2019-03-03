package com.blog.service;
import com.blog.entity.User;
import com.blog.vo.UserVo;

import java.util.List;
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

    /**
     * 管理员修改用户权限及密码
     * @param userVo
     * @return
     */
    int updateUserByAdmin(UserVo userVo);

    /**
     * 用户修改个人信息
     * @param userVo
     * @return
     */
    int updateUserByUser(UserVo userVo);

    /**
     * 根据关键字查找用户
     * @param keyWord
     * @return
     */
    List<User> searchUserByKey(String keyWord);

    /**
     * 获取所有用户
     * @return
     */
    List<User> getUsers();
}
