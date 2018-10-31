package com.blog.service;

import com.blog.entity.BlogUser;

public interface UserService {
    /**
     *
     * @param loginName
     * @param password
     * @return
     */
    BlogUser login(String loginName, String password);
}
