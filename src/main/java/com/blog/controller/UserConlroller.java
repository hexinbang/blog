package com.blog.controller;

<<<<<<< HEAD
import com.blog.dao.UserDao;
import com.blog.entry.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserConlroller {
    private UserDao userDao;
    @Autowired
    private UserService userService;
    @RequestMapping("/FindUser")
    public User FindUser(@RequestBody User user){
        return userService.FindUser(user);
=======
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
>>>>>>> a12e191dbbdbb1bebea52ff00ca840e374ab3bd5
    }
}
