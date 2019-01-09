package com.blog.dao;
import com.blog.entity.User;
import com.blog.vo.UserVo;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.blog.entry.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
     User FindUser(User user);
=======
import java.util.List;

@Repository
public interface UserDao {
    public int updateUser(UserVo userVo);
    public User getUserById(int id);
    public int insertUser(UserVo userVo);
>>>>>>> a12e191dbbdbb1bebea52ff00ca840e374ab3bd5
}
