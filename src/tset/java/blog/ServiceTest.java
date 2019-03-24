package blog;

import com.auth0.jwt.interfaces.Claim;
import com.blog.entity.User;
import com.blog.service.EssayService;
import com.blog.service.UserService;
import com.blog.service.impl.RegisterServiceImpl;
import com.blog.util.MailUtil;
import com.blog.util.TokenUtil;
import com.blog.vo.EssayVo;
import com.blog.vo.UserVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hxb
 * @date 2019/1/12 14:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:dispatcher-servlet.xml", "classpath:spring-mybatis.xml"})
public class ServiceTest {
    @Autowired
    MailUtil mailUtil;
    @Autowired
    UserService userService;
    @Autowired
    EssayService essayService;
    @Autowired
    RegisterServiceImpl registerServiceImpl;

    @Test
    public void test1(){
        UserVo userVo=new UserVo();
        userVo.setUsername("hxb");
        userVo.setPassword("11111");
        userVo.setSex("男");
        userVo.setCode("2719");
        userVo.setRoleId(2);
        userService.insertUser(userVo);
    }
    @Test
    public void test2(){
        UserVo userVo=new UserVo();
        userVo.setUsername("hxb");
        userVo.setPassword("11111");
        User user=new User();
        user.setId(1);
        user.setRoleId(1);
        Map <String,Claim>claims=new HashMap();
        claims = TokenUtil.verifyToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJXZWIiLCJpc3MiOiJTZXJ2aWNlIiwiZXhwIjoxNTUyMzc3NTM3LCJ1c2VySWQiOjEsImlhdCI6MTU1MTUxMzUzNywiYXV0aElkIjoxfQ.bAPdeUanETsuQFp5rgojCyytz7MScxKDxxdliKAOpQA");
        System.out.println(claims.get("iss").asString());
    }
    @Test
    public void test3(){
        EssayVo essayVo=new EssayVo();
        essayVo.setTitle("hey come on here");
        essayVo.setContent("a really title");
        essayVo.setUserId(2);
        System.out.println(userService.searchUserByKey(".com"));
    }
}
