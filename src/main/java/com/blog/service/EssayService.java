package com.blog.service;

import com.blog.entity.Essay;
import com.blog.vo.EssayVo;
import com.blog.entity.Essay;
import com.blog.vo.EssayVo;

import javax.net.ssl.ExtendedSSLSession;
import java.util.List;

public interface EssayService {
    /**
     * 获取所有文章
     * @return
     */
    List<Essay> getAllEssay();

    /**
     * 根据关键字查询文章
     * @param keyWord
     * @return
     */
     List<Essay>searchEssayByKey(String keyWord);

    /**
     * 删除文章
     * @param id
     * @return
     */
     int deleteEssay(int id);

    /**
     * 更新文章信息
     * @param essayVo
     * @return
     */
     int updateEssay(EssayVo essayVo);

    /**
     * 查找用户发表的文章
     * @param userId
     * @return
     */
     List<Essay> getEssayByUserId(int userId);

    /**
     * 添加文章
     * @param essayVo
     * @return
     */
     int insertEssay(EssayVo essayVo);
}
