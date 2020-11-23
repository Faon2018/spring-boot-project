package com.faon.blog.entity;

import java.util.List;

public class SystemUserRole {
    private Long id;
    private Long userId;
    private Long roleId;
    private Integer status;
    private List<SystemRole> systemRoles;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SystemRole> getSystemRoles() {
        return systemRoles;
    }

    public void setSystemRoles(List<SystemRole> systemRoles) {
        this.systemRoles = systemRoles;
    }

    @Override
    public String toString() {
        return "SystemUserRole{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                ", status=" + status +
                ", systemRoles=" + systemRoles +
                '}';
    }
}
