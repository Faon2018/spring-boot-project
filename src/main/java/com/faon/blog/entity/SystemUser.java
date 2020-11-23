package com.faon.blog.entity;

import java.util.List;

public class SystemUser {
    private Long id;
    private String username;
    private String password;
    private List<SystemUserRole> systemUserRoles;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SystemUserRole> getSystemUserRoles() {
        return systemUserRoles;
    }

    public void setSystemUserRoles(List<SystemUserRole> systemUserRoles) {
        this.systemUserRoles = systemUserRoles;
    }

    @Override
    public String toString() {
        return "SystemUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", systemUserRoles=" + systemUserRoles +
                '}';
    }
}
