package com.blog.dao;
import com.blog.entry.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public int updateUser(User user);
    public User getUserById(int id);
}
