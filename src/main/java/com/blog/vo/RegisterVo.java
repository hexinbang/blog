package com.blog.vo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author hxb
 * @date 2019/1/6 23:54
 */
@Data
@Alias("registerVo")
public class RegisterVo {
    private String emailAddress;
    private String code;
    private long expireTime;
}
