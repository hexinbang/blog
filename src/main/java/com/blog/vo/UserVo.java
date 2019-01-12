package com.blog.vo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author hxb
 * @date 2019/1/6 20:00
 */
@Data
@Alias("userVo")
public class UserVo {
    int id;
    String username;
    String password;
    String email;
    String code;
    int authId;
    String sex;
}
