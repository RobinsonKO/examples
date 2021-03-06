package com.youthlin.demo.mvc.service;

import com.youthlin.demo.mvc.dao.IUserDao;
import com.youthlin.ioc.annotaion.Bean;
import com.youthlin.ioc.annotaion.Service;

/**
 * 创建： youthlin.chen
 * 时间： 2017-08-13 13:39.
 */
@Service
public class UserService implements IUserService {
    @Bean private IUserDao userDao;

    @Override public String sayHello(long id) {
        return "Hello, " + userDao.getUserName(id);
    }
}
