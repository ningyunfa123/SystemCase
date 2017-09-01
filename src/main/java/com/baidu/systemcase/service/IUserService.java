package com.baidu.systemcase.service;

import com.baidu.systemcase.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by ningyunfa on 2017/9/1.
 */

public interface IUserService {
    public User selectUser(long userId);
}
