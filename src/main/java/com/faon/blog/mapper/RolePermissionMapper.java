package com.faon.blog.mapper;

import com.faon.blog.entity.SystemRolePermission;
import org.springframework.web.bind.annotation.PathVariable;

public interface RolePermissionMapper {
    SystemRolePermission findByRoleId(@PathVariable("roleId") int id);
}
