package com.blog.vo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author hxb
 * @date 2019/1/6 19:58
 */
@Data
@Alias("essayVo")
public class EssayVo {
    private int id;
    private String title;
    private String content;
    private String time;
    private int userId;
}
