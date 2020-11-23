package com.faon.blog.mapper;

import com.faon.blog.entity.SystemUserRole;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


public interface UserRoleMapper {
   SystemUserRole findByUserId(@PathVariable("userId") int userId);
}
