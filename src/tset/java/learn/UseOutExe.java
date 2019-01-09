package learn;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * @author hxb
 * @date 2019/1/6 21:02
 */

public class UseOutExe {
    public static void main(String args[]) throws MessagingException {
//        Properties properties=new Properties();
//        properties.setProperty("mail.transport.protocol","smtp");
//        properties.setProperty("mail.smtp.auth","true");
//        Session session=Session.getInstance(properties);
//        session.setDebug(true);
//        Message message=new MimeMessage(session);
//        Transport transport=null;
//        try {
//            message.setFrom(new InternetAddress("1790640933@qq.com"));
//            ((MimeMessage) message).setText("你的邮箱验证码为………………");
//            message.setSubject("邮箱验证");
//            transport=session.getTransport();
//            transport.connect("smtp.qq.com",587,"1790640933@qq.com","lckzpbmketfffaaj");
//            transport.sendMessage(message,new Address[]{new InternetAddress("404189425@qq.com")});
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }finally {
//            transport.close();;
//        }

        Date date=new Date();
        String string="1546827984563";
        long num=Long.parseLong(string)+15*60*1000;
        System.out.println(date.getTime()>num);
    }
}
