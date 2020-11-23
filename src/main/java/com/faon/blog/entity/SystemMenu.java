package com.faon.blog.entity;

import java.util.List;

public class SystemMenu {
    private Long id;
    private String name;
    private String url;
    private Long sort;
    private Long parentId;
    private Integer status;
    private List<SystemMenu> childrenMenus;
    private SystemMenu parentMenu;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SystemMenu> getChildrenMenus() {
        return childrenMenus;
    }

    public void setChidrenMenus(List<SystemMenu> childrenMenus) {
        this.childrenMenus = childrenMenus;
    }

    public void setChildrenMenus(List<SystemMenu> childrenMenus) {
        this.childrenMenus = childrenMenus;
    }

    public SystemMenu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(SystemMenu parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Override
    public String toString() {
        return "SystemMenu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", sort=" + sort +
                ", parentId=" + parentId +
                ", status=" + status +
                ", childrenMenus=" + childrenMenus +
                ", parentMenu=" + parentMenu +
                '}';
    }
}
