package com.faon.blog.service;

import com.faon.blog.dao.UserDao;
import com.faon.blog.entity.SystemUser;
import com.faon.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDao {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(SystemUser user) {
        return userMapper.add(user);

    }
    @Override
    public SystemUser findUserById(int id) {
        return userMapper.findUserById(id);
    }


}
