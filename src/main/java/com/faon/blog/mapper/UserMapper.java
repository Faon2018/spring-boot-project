package com.faon.blog.mapper;

import com.faon.blog.entity.SystemUser;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


public interface UserMapper {
    int add(SystemUser user);
    SystemUser findUserById(@PathVariable("id") int id);
}
