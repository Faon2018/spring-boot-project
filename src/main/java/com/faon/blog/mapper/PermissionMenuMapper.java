package com.faon.blog.mapper;

import com.faon.blog.entity.SystemPermissionMenu;
import org.springframework.web.bind.annotation.PathVariable;

public interface PermissionMenuMapper {
    SystemPermissionMenu findByPermissionId(@PathVariable("permissionId") int permissionId);
}
