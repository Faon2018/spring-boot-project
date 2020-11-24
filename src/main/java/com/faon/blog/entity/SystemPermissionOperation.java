package com.faon.blog.entity;


/**
 * permission 与 permission_operation 一对多
 * permission_operation 与 operation 一对一
 */
public class SystemPermissionOperation {
    private Integer id;
    private Integer permissionId;
    private Integer operationId;
    private Integer status;
    private SystemOperation systemOperation;

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

    public SystemOperation getSystemOperation() {
        return systemOperation;
    }

    public void setSystemOperation(SystemOperation systemOperation) {
        this.systemOperation = systemOperation;
    }

    @Override
    public String toString() {
        return "SystemPermissionOperation{" +
                "id=" + id +
                ", permissionId=" + permissionId +
                ", operationId=" + operationId +
                ", status=" + status +
                ", systemOperation=" + systemOperation +
                '}';
    }
}
