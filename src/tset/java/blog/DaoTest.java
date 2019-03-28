package blog;

import com.blog.dao.EssayDao;
import com.blog.vo.EssayVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author hxb
 * @date 2019/3/5 19:58
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:dispatcher-servlet.xml","classpath:spring-mybatis.xml"})
public class DaoTest {
    @Autowired
    private EssayDao essayDao;
    @Test
    public void test1(){
        EssayVo essayVo=new EssayVo();
        essayVo.setTitle("test");
        System.out.println(essayDao.queryList(essayVo));
    }
}
