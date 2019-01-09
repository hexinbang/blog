package com.blog.dao;
import com.blog.entity.User;
import com.blog.vo.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public int updateUser(UserVo userVo);
    public User getUserById(int id);
    public int insertUser(UserVo userVo);
}
