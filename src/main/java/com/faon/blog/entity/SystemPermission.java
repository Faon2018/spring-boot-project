package com.faon.blog.entity;

import java.util.List;

public class SystemPermission {
    private Long id;
    private String name;//权限节点名称
    private Integer status;//状态
    private List<SystemPermissionMenu> systemPermissionMenus;
    private List<SystemPermissionOperation> systemPermissionOperations;

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

    public List<SystemPermissionMenu> getSystemPermissionMenus() {
        return systemPermissionMenus;
    }

    public void setSystemPermissionMenus(List<SystemPermissionMenu> systemPermissionMenus) {
        this.systemPermissionMenus = systemPermissionMenus;
    }

    public List<SystemPermissionOperation> getSystemPermissionOperations() {
        return systemPermissionOperations;
    }

    public void setSystemPermissionOperations(List<SystemPermissionOperation> systemPermissionOperations) {
        this.systemPermissionOperations = systemPermissionOperations;
    }

    @Override
    public String toString() {
        return "SystemPermission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", systemPermissionMenus=" + systemPermissionMenus +
                ", systemPermissionOperations=" + systemPermissionOperations +
                '}';
    }
}
