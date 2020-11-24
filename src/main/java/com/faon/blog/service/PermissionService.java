package com.faon.blog.service;

import com.faon.blog.dao.PermissionDao;
import com.faon.blog.entity.SystemPermission;
import com.faon.blog.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService implements PermissionDao {
    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public SystemPermission findPermission(int permissionId) {
        return permissionMapper.findPermissionByPermissionId(permissionId);
    }
}
