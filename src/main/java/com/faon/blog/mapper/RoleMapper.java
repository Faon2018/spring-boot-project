package com.faon.blog.mapper;

import com.faon.blog.entity.SystemRole;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


public interface RoleMapper {
    SystemRole findRoleByRoleId(@PathVariable("roleId") int roleId);
}
