package com.faon.blog.entity;

/**
 * user 与 user_role 一对多
 * user_role 与 role 一对一
 */
public class SystemUserRole {
    private Integer id;
    private Integer userId;
    private Integer roleId;
    private Integer status;
    private SystemRole systemRole;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SystemRole getSystemRole() {
        return systemRole;
    }

    public void setSystemRole(SystemRole systemRole) {
        this.systemRole = systemRole;
    }

    @Override
    public String toString() {
        return "SystemUserRole{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                ", status=" + status +
                ", systemRole=" + systemRole +
                '}';
    }
}
