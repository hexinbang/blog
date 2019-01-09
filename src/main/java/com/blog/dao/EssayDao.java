package com.blog.dao;

import com.blog.entity.Essay;
import com.blog.vo.EssayVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EssayDao {
    public List<Essay> getAllEssay();
    public List<Essay> searchEssayByKey(String keyWord);
    public List<Essay>getEssayByUserId(int userId);
    public int deleteEssay(int id);
    public int updateEssay(EssayVo essayVo);
}
