package com.faon.blog.mapper;

import com.faon.blog.entity.SystemPermissionMenu;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PermissionMenuMapper {
    List<SystemPermissionMenu> findByPermissionId(@PathVariable("permissionId") int permissionId);
}
