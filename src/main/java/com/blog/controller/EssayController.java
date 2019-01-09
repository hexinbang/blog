package com.blog.controller;

import com.blog.entity.Essay;
import com.blog.entity.JsonAndToken;
import com.blog.service.impl.EssayServiceImpl;
import com.blog.vo.EssayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EssayController {
<<<<<<< HEAD
=======

    @Autowired
    EssayServiceImpl essayServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/getEssay",method = {RequestMethod.GET})
    public JsonAndToken getAllEssay(){
        List<Essay> essayList= essayServiceImpl.getAllEssay();
        return  JsonAndToken.builder()
                .data(essayList)
                .status("success")
                .total(essayList.size())
                .build();
    }

    @ResponseBody
    @RequestMapping(value = "/searchEssay",method = RequestMethod.GET)
    public JsonAndToken searchEssay(@RequestParam String keyWord){
        List<Essay>essayList= essayServiceImpl.searchEssayByKey(keyWord);
        return  JsonAndToken.builder()
                .data(essayList)
                .status("success")
                .total(essayList.size())
                .build();
    }

    @ResponseBody
    @RequestMapping(value = "/deleteEssay",method = {RequestMethod.GET})
    public JsonAndToken deleteEssay(@RequestParam int id){
        return  JsonAndToken.builder()
                .total(essayServiceImpl.deleteEssay(id))
                .status("success")
                .build();
    }

    @ResponseBody
    @RequestMapping(value = "/updateEssay",method = {RequestMethod.POST})
    public JsonAndToken updateEssay(@RequestBody EssayVo essayVo){
        return JsonAndToken.builder()
                .total(essayServiceImpl.updateEssay(essayVo))
                .status("success")
                .build();
    }

    @ResponseBody
    @RequestMapping(value = "/getEssayByUserId",method = {RequestMethod.GET})
    public JsonAndToken getEssayByUserId(@RequestParam int userId){
        List<Essay>essayList=essayServiceImpl.getEssayByUserId(userId);
        return JsonAndToken.builder()
                .data(essayList)
                .total(essayList.size())
                .status("success")
                .build();
    }

>>>>>>> a12e191dbbdbb1bebea52ff00ca840e374ab3bd5
}
