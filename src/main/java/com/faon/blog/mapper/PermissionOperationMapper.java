package com.faon.blog.mapper;

import com.faon.blog.entity.SystemPermissionOperation;
import org.springframework.web.bind.annotation.PathVariable;

public interface PermissionOperationMapper {
    SystemPermissionOperation findByPermissionId(@PathVariable("permissionId") int permissionId);
}
