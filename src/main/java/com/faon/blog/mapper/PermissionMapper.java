package com.faon.blog.mapper;

import com.faon.blog.entity.SystemPermission;
import org.springframework.web.bind.annotation.PathVariable;

public interface PermissionMapper {
    SystemPermission findPermissionByPermissionId(@PathVariable("permissionId") int permissionId);
}
