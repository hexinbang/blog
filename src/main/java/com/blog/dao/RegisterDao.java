package com.blog.dao;

import com.blog.vo.RegisterVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hxb
 * @date 2019/1/6 23:52
 */

@Repository
public interface RegisterDao {
    public int insertRequestMessage(RegisterVo registerVo);
    public List<Integer>getRequestMessage(RegisterVo registerVo);
}
