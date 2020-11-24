package com.faon.blog.entity;

import java.util.List;

public class SystemRole {
    private Integer id;
    private String name;//角色名称
    private Integer status;//状态标识
    private List<SystemRolePermission> systemRolePermissions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
