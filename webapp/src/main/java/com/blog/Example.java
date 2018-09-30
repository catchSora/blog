//package com.blog;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.RestController;
//import tk.mybatis.spring.annotation.MapperScan;
//@RestController
//@ComponentScan("com.blog")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@MapperScan("com.**.dao")
//public class Example {
//
////    @Autowired
////    private BlogUserDao blogUserDao;
//
////    @RequestMapping("/")
////    String home() {
////        PageHelper.startPage(1,20);
////        List<BlogUser> blogUsers = blogUserDao.selectAll();
////        return "" + blogUsers.size();
////    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Example.class, args);
//    }
//
//}