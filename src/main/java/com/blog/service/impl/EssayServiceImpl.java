package com.blog.service.impl;

<<<<<<< HEAD
import com.blog.service.EssayService;

public class EssayServiceImpl implements EssayService {
=======
import com.blog.dao.EssayDao;
import com.blog.entity.Essay;
import com.blog.service.EssayService;
import com.blog.service.util.MailUtil;
import com.blog.vo.EssayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import java.util.List;

@Service
public class EssayServiceImpl implements EssayService {
    @Autowired
    EssayDao essayDao;

    @Autowired
    MailUtil mailUtil;

    public List<Essay>getAllEssay(){
        return essayDao.getAllEssay();
    }

    public List<Essay>searchEssayByKey(String keyWord){
        return essayDao.searchEssayByKey(keyWord);
    }

    public int deleteEssay(int id){
        return essayDao.deleteEssay(id);
    }

    public int updateEssay(EssayVo essayVo){
        return essayDao.updateEssay(essayVo);
    }

    @Override
    public List<Essay> getEssayByUserId(int userId) {
        return essayDao.getEssayByUserId(userId);
    }
>>>>>>> a12e191dbbdbb1bebea52ff00ca840e374ab3bd5
}
