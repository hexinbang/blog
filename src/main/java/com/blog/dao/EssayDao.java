package com.blog.dao;

import com.blog.entry.Essay;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EssayDao {
    public List<Essay> getAllEssay();
    public List<Essay> searchEssayByKey(String keyWord);
    public List<Essay>getEssayByUserId(int id);
    public int deleteEssay(int id);
    public int updateEssay(Essay essay);
}
