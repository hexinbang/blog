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
    String username;
    String password;
    String email;
    int authId;
    String sex;
}
