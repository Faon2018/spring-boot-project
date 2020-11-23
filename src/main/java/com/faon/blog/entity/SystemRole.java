package com.faon.blog.entity;

import java.util.List;

public class SystemRole {
    private Long id;
    private String name;//角色名称
    private Integer status;//状态标识
    private List<SystemRolePermission> systemRolePermissions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SystemRolePermission> getSystemRolePermissions() {
        return systemRolePermissions;
    }

    public void setSystemRolePermissions(List<SystemRolePermission> systemRolePermissions) {
        this.systemRolePermissions = systemRolePermissions;
    }

    @Override
    public String toString() {
        return "SystemRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", systemRolePermissions=" + systemRolePermissions +
                '}';
    }
}
