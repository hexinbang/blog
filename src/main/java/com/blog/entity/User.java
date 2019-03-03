package com.blog.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user")
public class User {
    private int id;
    private String username;
    private String sex;
    private String name;
    private int roleId;
}
