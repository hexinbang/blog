package com.blog.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserAuthDao {
    public Integer getIdByUrl(String url);
    public Integer getRoleAuth(Map<String,Object> map);
}
