package me.imyu.service.impl;

import me.imyu.dao.UserDao;
import me.imyu.entity.User;
import me.imyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imyu on 2017-12-01.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    public List<User> getAll() {
        return userDao.queryAll();
    }
}
