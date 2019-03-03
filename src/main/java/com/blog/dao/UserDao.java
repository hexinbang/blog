package com.blog.dao;
import com.blog.entity.User;
import com.blog.vo.UserVo;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao {
    public int updateUserByAdmin(UserVo userVo);
    public int updateUserByUser(UserVo userVo);
    public User getUserById(int id);
    public int insertUser(UserVo userVo);
    public User findUser(UserVo userVo);
    public List<User>searchUserByKey(String keyWord);
    public List<User>getUsers();
}
