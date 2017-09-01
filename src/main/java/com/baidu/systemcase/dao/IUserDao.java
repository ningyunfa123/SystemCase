package com.baidu.systemcase.dao;

import com.baidu.systemcase.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by ningyunfa on 2017/9/1.
 */
@Repository
public interface IUserDao {
    User selectUser(long id);
}
