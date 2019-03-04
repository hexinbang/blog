package com.blog.service;

/**
 * @author hxb
 * @date 2019/3/4 20:46
 */

public interface RegisterService {
    /**
     * 发送邮件
     * @param emailAddress
     * @return
     */
    int sendEmail(String emailAddress);

    /**
     * 检测验证码
     * @param emailAddress
     * @param code
     * @return
     */
    boolean getValidateCodeIds(String emailAddress,String code);

}
