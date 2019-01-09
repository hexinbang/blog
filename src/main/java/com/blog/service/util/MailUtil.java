package com.blog.service.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author hxb
 * @date 2019/1/6 21:36
 */
@Service
public class MailUtil {

    @Value("${email.address}")
    private  String sendAddress;

    @Value("${email.host}")
    private  String host;

    @Value("${email.port}")
    private  int port;

    @Value("${email.authorizationCode}")
    private  String authorizationCode;

    public void sendEmail(String receiveAddress,String emailContent,String emailSubject) throws MessagingException {
        Properties properties=new Properties();
        properties.setProperty("mail.transport.protocol","smtp");//协议
        properties.setProperty("mail.smtp.auth","true");//需要验证
        //properties.setProperty("mail.debug","true");//设置debug模式，后台输出邮件发送过程
        Session session=Session.getInstance(properties);
        //session.setDebug(true);//debug模式
        //邮件信息
        Message message=new MimeMessage(session);
        Transport transport=null;
        try {
            message.setFrom(new InternetAddress(sendAddress));//发送人
            message.setText(emailContent);//邮件信息
            message.setSubject(emailSubject);//邮件主题
            transport=session.getTransport();
            transport.connect(host,port,sendAddress,authorizationCode);
            transport.sendMessage(message,new Address[]{new InternetAddress(receiveAddress)});
        } catch (MessagingException e) {
            e.printStackTrace();
        }finally {
            transport.close();;
        }
    }
}
