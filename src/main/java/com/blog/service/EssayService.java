package com.blog.service;

import com.blog.entry.Essay;

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
     * @param essay
     * @return
     */
    public int updateEssay(Essay essay);
}
