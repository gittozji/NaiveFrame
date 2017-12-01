package me.imyu.dao;

import me.imyu.entity.User;

import java.util.List;

/**
 * Created by imyu on 2017-12-01.
 */
public interface UserDao {
    List<User> queryAll();
}
