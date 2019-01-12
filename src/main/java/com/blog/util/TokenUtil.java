package com.blog.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.blog.entity.User;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtil {
        /*token秘钥*/
        public static final String SECRET="blog";
        /*token过期时间：10天*/
        public static final int calendarField= Calendar.DATE;
        public static final int calendarInterval=10;

        /*JWT生成token
        *
        * jwt结构：header，payload，signature
        * @param user_id
        * */
         public static String CreatToken(User user)throws Exception{
             Date iatDate=new Date();
             //expire time到期时间
             Calendar nowTime=Calendar.getInstance();
             nowTime.add(calendarField,calendarInterval);
             Date expiresDate = nowTime.getTime();
             //header Map
             Map<String,Object>map=new HashMap<>();
             map.put("alg","HS256");//编码的方式
             map.put("typ","JWT");
             String token= JWT.create().withHeader(map)
                     .withClaim("iss","Service")
                     .withClaim("aud","Web")
                     .withClaim("userId",user.getId())
                     .withClaim("authId",user.getAuthId())
                     .withIssuedAt(iatDate)//sign time
                     .withExpiresAt(expiresDate)//expire time
                     .sign(Algorithm.HMAC256(SECRET));//signature
             return token;
         }
         /*
         * 解密token
         * @param token
         * @return
         * @throws Exception
         * */
         public static Map<String, Claim>verifyToken(String token){
             DecodedJWT jwt=null;
             try{
                 JWTVerifier verifier=JWT.require(Algorithm.HMAC256(SECRET)).build();
                 jwt=verifier.verify(token);
             }catch (Exception e){
                 e.printStackTrace();
             }
             return jwt.getClaims();
         }
}

