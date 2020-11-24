package com.faon.blog.mapper;

import com.faon.blog.entity.SystemUserRole;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface UserRoleMapper {
   List<SystemUserRole> findByUserId(@PathVariable("userId") int userId);
}
