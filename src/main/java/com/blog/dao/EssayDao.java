package com.blog.dao;

import com.blog.entity.Essay;
import com.blog.util.BaseDao;
import com.blog.vo.EssayVo;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EssayDao extends BaseDao<Essay,EssayVo> {
    public List<Essay> getAllEssay();
    public List<Essay> searchEssayByKey(String keyWord);
    public List<Essay>getEssayByUserId(int userId);
    public int deleteEssayByAdmin(int id);
    public int deleteEssayByUser(EssayVo essayVo);
    public int updateEssay(EssayVo essayVo);
    public int insertEssay(EssayVo essayVo);
}
