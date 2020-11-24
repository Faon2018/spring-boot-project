package com.faon.blog.dao;

import com.faon.blog.entity.SystemPermission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionDao {
    SystemPermission findPermission(int permissionId);
}
