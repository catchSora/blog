//package com.com.blog;
//
//import com.com.blog.service.UserService;
//import com.com.blog.dao.BlogUserDao;
//import com.com.blog.entity.BlogUser;
//import com.github.pagehelper.PageHelper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import tk.mybatis.spring.annotation.MapperScan;
//
//import java.util.List;
//
//@RestController
//@ComponentScan(basePackages = {"com.com.blog", "com.com.blog.service"})
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@MapperScan("com.**.dao")
//public class Example {
//
//    @Autowired
//    private BlogUserDao blogUserDao;
//    @Autowired
//    private UserService blogService;
//
//    @RequestMapping("/")
//    String home() {
//        PageHelper.startPage(1,20);
//        List<BlogUser> blogUsers = blogUserDao.selectAll();
//        return "" + blogUsers.size();
//    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Example.class, args);
//    }
//
//}