package com.blog.controller;

import com.blog.dao.UserDao;
import com.blog.entity.JsonAndToken;
import com.blog.entity.User;
import com.blog.service.UserService;
import com.blog.service.impl.RegisterService;
import com.blog.service.impl.UserServiceImpl;
import com.blog.util.TokenUtil;
import com.blog.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RegisterService registerService;

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/getUserRoom",method = {RequestMethod.GET})
    public JsonAndToken getUserRoom(@RequestParam int id){
        return  JsonAndToken.builder()
                .data(userService.getUserRoom(id))
                .status("success")
                .build();
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/sendEmail",method = {RequestMethod.GET})
    public JsonAndToken sendCodeEmail(@RequestParam String emailAddress){
        return JsonAndToken.builder()
                .data(registerService.sendEmail(emailAddress))
                .status("success")
                .build();
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/insertUser",method = {RequestMethod.POST})
    public JsonAndToken insertUser(@RequestBody UserVo userVo){
        return JsonAndToken.builder()
                .data(userService.insertUser(userVo))
                .status("success")
                .build();
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/findUser",method = {RequestMethod.POST})
    public JsonAndToken findUser(@RequestBody UserVo userVo) {
        User user=userService.findUser(userVo);
        return JsonAndToken.builder()
                .data(user)
                .token(userService.createToken(user))
                .status("success")
                .build();
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/updateUserByAdmin",method = {RequestMethod.POST})
    public JsonAndToken updateUserByAdmin(@RequestBody UserVo userVo){
        return  JsonAndToken.builder()
                .data(userService.updateUserByAdmin(userVo))
                .status("success")
                .build();
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value="/updateUserByUser",method = {RequestMethod.POST})
    public JsonAndToken updateUserByUser(@RequestBody UserVo userVo){
        return JsonAndToken.builder()
                .data(userService.updateUserByUser(userVo))
                .status("success")
                .build();
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/searchUser",method = {RequestMethod.GET})
    public JsonAndToken searchUser(@RequestParam String keyWord){
        return  JsonAndToken.builder()
                .data(userService.searchUserByKey(keyWord))
                .status("success")
                .build();
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/getUsers",method = {RequestMethod.GET})
    public JsonAndToken getUsers(){
        return JsonAndToken.builder()
                .data(userService.getUsers())
                .status("success")
                .build();
    }
}
