package com.faon.blog.entity;

import java.util.List;

public class SystemPermissionMenu {
    private Long id;
    private Long permissionId;
    private Long menuId;
    private Integer status;
    private List<SystemMenu> systemMenus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SystemMenu> getSystemMenus() {
        return systemMenus;
    }

    public void setSystemMenus(List<SystemMenu> systemMenus) {
        this.systemMenus = systemMenus;
    }

    @Override
    public String toString() {
        return "SystemPermissionMenu{" +
                "id=" + id +
                ", permissionId=" + permissionId +
                ", menuId=" + menuId +
                ", status=" + status +
                ", systemMenus=" + systemMenus +
                '}';
    }
}
