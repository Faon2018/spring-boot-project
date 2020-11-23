package com.faon.blog.entity;

import java.util.List;

public class SystemPermissionOperation {
    private Long id;
    private Long permissionId;
    private Long operationId;
    private Integer status;
    private List<SystemOperation> systemOperations;

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

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
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
