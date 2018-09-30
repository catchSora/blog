package com.blog.dao;

import com.BaseMapper;
import com.blog.entity.BlogUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
* 通用 Mapper 代码生成器
*
* @author mapper-generator
*/
@Mapper
@Component
public interface BlogUserDao extends BaseMapper<BlogUser> {

}
