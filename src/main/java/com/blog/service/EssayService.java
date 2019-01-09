package com.blog.service;

import com.blog.entity.Essay;
import com.blog.vo.EssayVo;

import java.util.List;

public interface EssayService {
    /**
     * 获取所有文章
     * @return
     */
    public List<Essay>getAllEssay();

    /**
     * 根据关键字查询文章
     * @param keyWord
     * @return
     */
    public List<Essay>searchEssayByKey(String keyWord);

    /**
     * 删除文章
     * @param id
     * @return
     */
    public int deleteEssay(int id);

    /**
     * 更新文章信息
     * @param essayVo
     * @return
     */
    public int updateEssay(EssayVo essayVo);

    /**
     * 查找用户发表的文章
     * @param userId
     * @return
     */
    public List<Essay>getEssayByUserId(int userId);
}
