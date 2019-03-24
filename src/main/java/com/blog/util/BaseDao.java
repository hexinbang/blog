package com.blog.util;

import java.util.List;

/**
 * @author hxb
 * @date 2019/3/3 16:27
 */

public interface BaseDao<T,Q > {

    int deleteById(Integer var1);

    int insert(Q var1);

    List<T>queryList(Q var1);

    T queryById(int var1);

    List<T>queryByIds(Q var1);

    int updateById(Q var1);

    List<T>queryByIds(List<Integer>list);

}
