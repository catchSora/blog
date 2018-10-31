package com.blog.service.impl;

import com.blog.service.UserService;
import com.blog.dao.BlogUserDao;
import com.blog.entity.BlogUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private BlogUserDao blogUserDao;


    /**
     * @param loginName
     * @param password
     * @return
     */
    public BlogUser login(String loginName, String password) {
        BlogUser blogUser = new BlogUser();
        blogUser.setLoginName(loginName);
        blogUser.setLoginPassword(password);
        return blogUserDao.selectOne(blogUser);
    }
}
