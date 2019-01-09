package com.blog.entity;

import lombok.Data;

@Data
public class UserAuth {
    private int id;
    private int user_type;
    private String auth;
}
