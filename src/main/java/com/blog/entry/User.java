package com.blog.entry;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user")
public class User {
    private int id;
    private String username;
    private int authId;
}
