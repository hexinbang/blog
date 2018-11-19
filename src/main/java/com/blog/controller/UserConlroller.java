package com.blog.controller;

import com.blog.entry.JsonAndToken;
import com.blog.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserConlroller{

    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    public JsonAndToken getUserRoom(int id){
        return new JsonAndToken().builder()
                .data(userService.getUserRoom(id))
                .status("success")
                .build();
    }

}
