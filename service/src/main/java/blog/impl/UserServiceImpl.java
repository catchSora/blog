package blog.impl;

import blog.UserService;
import com.blog.dao.BlogUserDao;
import com.blog.entity.BlogUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    BlogUserDao blogUserDao;

    /**
     * @param loginName
     * @param password
     * @return
     */
    @Override
    public BlogUser login(String loginName, String password) {
        BlogUser blogUser = new BlogUser();
        blogUser.setLoginName(loginName);
        blogUser.setLoginPassword(password);
        return blogUserDao.selectOne(blogUser);
    }
}
