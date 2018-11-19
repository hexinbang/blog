package com.blog.service.impl;

import com.blog.dao.EssayDao;
import com.blog.entry.Essay;
import com.blog.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EssayServiceImpl implements EssayService {
    @Autowired
    EssayDao essayDao;

    public List<Essay>getAllEssay(){
        return essayDao.getAllEssay();
    }

    public List<Essay>searchEssayByKey(String keyWord){
        return essayDao.searchEssayByKey(keyWord);
    }

    public int deleteEssay(int id){
        return essayDao.deleteEssay(id);
    }

    public int updateEssay(Essay essay){
        return essayDao.updateEssay(essay);
    }
}
