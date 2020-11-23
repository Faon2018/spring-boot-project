package com.faon.blog.dao;

import com.faon.blog.entity.SystemUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int addUser(SystemUser user);
    SystemUser findUserById(int id);
}
