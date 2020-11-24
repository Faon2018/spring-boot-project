package com.faon.blog.entity;

import java.security.Permission;

/**
 * role 与 role_permission 一对多
 * role_permission 与 permission 一对一
 */
public class SystemRolePermission {
    private Integer id;
    private Integer roleId;
    private Integer permissionId;
    private Integer status;
    private SystemPermission systemPermission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SystemPermission getSystemPermission() {
        return systemPermission;
    }

    public void setSystemPermission(SystemPermission systemPermission) {
        this.systemPermission = systemPermission;
    }

    @Override
    public String toString() {
        return "SystemRolePermission{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", permissionId=" + permissionId +
                ", status=" + status +
                ", systemPermission=" + systemPermission +
                '}';
    }
}
