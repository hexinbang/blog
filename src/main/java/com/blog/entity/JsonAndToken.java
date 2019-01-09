package com.blog.entity;

import lombok.Getter;

@Getter
public class JsonAndToken {
    Object data;
    String status;
    String token;
    int total;

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        Object data;
        String status;
        String token;
        int total;

        public Builder data(Object data){
            this.data=data;
            return this;
        }
        public Builder status(String status){
            this.status=status;
            return this;
        }
        public Builder token(String token){
            this.token=token;
            return this;
        }
        public Builder total(int total){
            this.total=total;
            return this;
        }
        public JsonAndToken build(){
            JsonAndToken jsonAndToken=new JsonAndToken();
            jsonAndToken.data=this.data;
            jsonAndToken.status=this.status;
            jsonAndToken.token=this.token;
            jsonAndToken.total=this.total;
            return jsonAndToken;
        }
    }
}
