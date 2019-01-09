package com.blog.controller;

import com.blog.entity.JsonAndToken;
import com.blog.service.impl.UserServiceImpl;
import com.blog.service.impl.RegisterService;
import com.blog.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserConlroller{

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RegisterService registerService;

    @ResponseBody
    public JsonAndToken getUserRoom(@RequestParam int id){
        return  JsonAndToken.builder()
                .data(userService.getUserRoom(id))
                .status("success")
                .build();
    }
    @ResponseBody
    @RequestMapping(value = "/sendEmail",method = {RequestMethod.GET})
    public JsonAndToken sendCodeEmail(@RequestParam String emailAddress){
        return JsonAndToken.builder()
                .data(registerService.sendEmail(emailAddress))
                .status("success")
                .build();
    }
    @ResponseBody
    @RequestMapping(value = "/insertUser",method = {RequestMethod.POST})
    public JsonAndToken insertUser(@RequestBody UserVo userVo, @RequestParam String code){
        return JsonAndToken.builder()
                .data(userService.insertUser(userVo,code))
                .status("success")
                .build();
    }
}
