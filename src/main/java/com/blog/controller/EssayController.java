package com.blog.controller;

import com.blog.entry.Essay;
import com.blog.entry.JsonAndToken;
import com.blog.service.impl.EssayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EssayController {

    @Autowired
    EssayServiceImpl essayServiceImpl;

    @ResponseBody
    public JsonAndToken getAllEssay(){
        List<Essay> essayList= essayServiceImpl.getAllEssay();
        return new JsonAndToken().builder()
                .data(essayList)
                .status("success")
                .total(essayList.size())
                .build();
    }

    @ResponseBody
    public JsonAndToken searchEssay(@RequestParam String keyWord){
        List<Essay>essayList= essayServiceImpl.searchEssayByKey(keyWord);
        return new JsonAndToken().builder()
                .data(essayList)
                .status("success")
                .total(essayList.size())
                .build();
    }

    @ResponseBody
    public JsonAndToken deleteEssay(int id){
        return new JsonAndToken().builder()
                .total(essayServiceImpl.deleteEssay(id))
                .status("success")
                .build();
    }

    @ResponseBody
    public JsonAndToken updateEssay(@RequestBody Essay essay){
        return new JsonAndToken().builder()
                .total(essayServiceImpl.updateEssay(essay))
                .status("success")
                .build();
    }

}
