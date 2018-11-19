package com.blog.entry;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@Alias("essay")
public class Essay {
    private int id;
    private String title;
    private String content;
    private Date date;
    private User user;
}
