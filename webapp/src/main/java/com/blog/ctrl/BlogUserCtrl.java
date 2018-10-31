package com.blog.ctrl;

import com.blog.service.UserService;
import com.blog.dao.BlogUserDao;
import com.blog.entity.BlogUser;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogUserCtrl {
    @Autowired
    private BlogUserDao blogUserDao;

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    Object home() {
        PageHelper.startPage(1,20);
        List<BlogUser> blogUsers = blogUserDao.selectAll();
        return blogUsers;
    }

    @RequestMapping("login")
    Object login(String loginName, String password){
        return userService.login(loginName, password);
    }
}
