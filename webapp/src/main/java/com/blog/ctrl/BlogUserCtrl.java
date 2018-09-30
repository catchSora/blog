package com.blog.ctrl;

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

    @RequestMapping("/user")
    Object home() {
        PageHelper.startPage(1,20);
        List<BlogUser> blogUsers = blogUserDao.selectAll();
        return blogUsers;
    }
}
