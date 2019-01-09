package com.blog.dao;

import com.blog.entry.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
     User FindUser(User user);
}
