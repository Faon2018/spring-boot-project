package com.faon.blog.entity;

import java.util.List;

public class SystemPermissionOperation {
    private Integer id;
    private Integer permissionId;
    private Integer operationId;
    private Integer status;
    private List<SystemOperation> systemOperations;

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

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SystemOperation> getSystemOperations() {
        return systemOperations;
    }

    public void setSystemOperations(List<SystemOperation> systemOperations) {
        this.systemOperations = systemOperations;
    }

    @Override
    public String toString() {
        return "SystemPermissionOperation{" +
                "id=" + id +
                ", permissionId=" + permissionId +
                ", operationId=" + operationId +
                ", status=" + status +
                ", systemOperations=" + systemOperations +
                '}';
    }
}
