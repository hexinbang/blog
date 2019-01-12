package com.blog.controller;

import com.blog.entity.Essay;
import com.blog.entity.JsonAndToken;
import com.blog.service.EssayService;
import com.blog.vo.EssayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EssayController {

    @Autowired
    EssayService essayService;

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/getEssay",method = {RequestMethod.GET})
    public JsonAndToken getAllEssay(){
        List<Essay> essayList= essayService.getAllEssay();
        return  JsonAndToken.builder()
                .data(essayList)
                .status("success")
                .total(essayList.size())
                .build();
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/searchEssay",method = RequestMethod.GET)
    public JsonAndToken searchEssay(@RequestParam String keyWord){
        List<Essay>essayList= essayService.searchEssayByKey(keyWord);
        return  JsonAndToken.builder()
                .data(essayList)
                .status("success")
                .total(essayList.size())
                .build();
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/deleteEssay",method = {RequestMethod.GET})
    public JsonAndToken deleteEssay(@RequestParam int id){
        return  JsonAndToken.builder()
                .total(essayService.deleteEssay(id))
                .status("success")
                .build();
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/updateEssay",method = {RequestMethod.POST})
    public JsonAndToken updateEssay(@RequestBody EssayVo essayVo){
        return JsonAndToken.builder()
                .total(essayService.updateEssay(essayVo))
                .status("success")
                .build();
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/getEssayByUserId",method = {RequestMethod.GET})
    public JsonAndToken getEssayByUserId(@RequestParam int userId){
        List<Essay>essayList= essayService.getEssayByUserId(userId);
        return JsonAndToken.builder()
                .data(essayList)
                .total(essayList.size())
                .status("success")
                .build();
    }
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/insertEssay",method = {RequestMethod.POST})
    public JsonAndToken insertEssay(@RequestBody EssayVo essayVo){
        return JsonAndToken.builder()
                .data(essayService.insertEssay(essayVo))
                .status("success")
                .build();
    }

}
