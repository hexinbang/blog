package com.blog.entry;

import lombok.Data;

@Data
public class Essay {
    private int id;
    private String title;
    private String content;
    private int userId;
}
