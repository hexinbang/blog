package com.blog.service.impl;

import com.blog.dao.RegisterDao;
import com.blog.service.util.MailUtil;
import com.blog.vo.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.Date;
import java.util.List;

/**
 * @author hxb
 * @date 2019/1/6 23:10
 */

@Service
public class RegisterService {

    @Autowired
    private RegisterDao registerDao;

    @Autowired
    private MailUtil mailUtil;

    private int indentityCode;

    Date date=new Date();

    public int sendEmail(String emailAddress){
        indentityCode= (int) (Math.random()*10000+Math.random()*100);
        String emailText="你的邮箱验证码为："+indentityCode+",验证码五分钟内有效!";
        String emailSubject="邮箱验证";
        try {
            mailUtil.sendEmail(emailAddress,emailText,emailSubject);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        RegisterVo registerVo=new RegisterVo();
        registerVo.setCode(indentityCode+"");
        registerVo.setEmailAddress(emailAddress);
        registerVo.setExpireTime(date.getTime()+5*60*1000);
        return registerDao.insertRequestMessage(registerVo);
    }

    public boolean getValidateCodeIds(String emailAddress,String code){
        RegisterVo registerVo=new RegisterVo();
        registerVo.setEmailAddress(emailAddress);
        registerVo.setCode(code);
        registerVo.setExpireTime(date.getTime());
        if(registerDao.getRequestMessage(registerVo).size()>0)return true;
        return false;
    }
}
