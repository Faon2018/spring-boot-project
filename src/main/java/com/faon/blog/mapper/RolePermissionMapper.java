package com.faon.blog.mapper;

import com.faon.blog.entity.SystemRolePermission;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RolePermissionMapper {
    List<SystemRolePermission> findByRoleId(@PathVariable("id") int id);
}
