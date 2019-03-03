package com.blog.AOP;

import com.auth0.jwt.interfaces.Claim;
import com.blog.dao.UserAuthDao;
import com.blog.entity.JsonAndToken;
import com.blog.util.TokenUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hxb
 * @date 2019/3/2 18:38
 */

@Component
@Aspect
public class AopAspect {

    @Autowired(required = false)
    private HttpServletRequest request;
    @Autowired()
    private UserAuthDao userAuthDao;

    @Pointcut("execution(* com.blog.controller.*Controller.*(..))")
    public void controller(){}

    @Around("controller()")
    public Object checkAccess(ProceedingJoinPoint proceedingJoinPoint){
        Object result=JsonAndToken.builder().status("System error");
        if(!check("test")){
            result=JsonAndToken.builder().status("Illegal access").build();
        }else{
            try {
                result=proceedingJoinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return result;
    }


    public boolean check(String token){
        Integer roleId;
        Map<String,Claim> claimMap=TokenUtil.verifyToken(token);
        if(claimMap==null)roleId=3;
        else roleId=claimMap.get("roleId").asInt();
        if(roleId==null)roleId=3;
        String url=request.getMethod()+":"+request.getRequestURI();
        Integer authId=userAuthDao.getIdByUrl(url);
        if(authId==null)return false;
        Map<String,Object>map=new HashMap<>();
        map.put("roleId",roleId);
        map.put("authId",authId);
        if(userAuthDao.getRoleAuth(map)!=null) return true;
        return false;
    }
}
