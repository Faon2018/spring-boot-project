package com.faon.blog.mapper;

import com.faon.blog.entity.SystemPermissionOperation;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PermissionOperationMapper {
    List<SystemPermissionOperation> findByPermissionId(@PathVariable("permissionId") int permissionId);
}
