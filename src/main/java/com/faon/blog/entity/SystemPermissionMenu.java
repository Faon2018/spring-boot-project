package com.faon.blog.entity;


/**
 * permission 与 permission_menu 一对多
 * permission_menu 与 menu 一对一
 */
public class SystemPermissionMenu {
    private Integer id;
    private Integer permissionId;
    private Integer menuId;
    private Integer status;
    private SystemMenu systemMenu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SystemMenu getSystemMenu() {
        return systemMenu;
    }

    public void setSystemMenu(SystemMenu systemMenu) {
        this.systemMenu = systemMenu;
    }

    @Override
    public String toString() {
        return "SystemPermissionMenu{" +
                "id=" + id +
                ", permissionId=" + permissionId +
                ", menuId=" + menuId +
                ", status=" + status +
                ", systemMenu=" + systemMenu +
                '}';
    }
}
