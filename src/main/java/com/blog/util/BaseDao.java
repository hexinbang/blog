package com.blog.util;

/**
 * @author hxb
 * @date 2019/3/3 16:27
 */

public interface BaseDao<Q> {
    String getNamespace();
    int deleteByPrimaryKey(Integer var);
    int insert(Q var1);
}
