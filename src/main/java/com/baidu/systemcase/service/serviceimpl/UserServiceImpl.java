package com.baidu.systemcase.service.serviceimpl;

import com.baidu.systemcase.dao.IUserDao;
import com.baidu.systemcase.model.User;
import com.baidu.systemcase.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ningyunfa on 2017/9/1.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
