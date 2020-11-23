package com.faon.blog.mapper;

import com.faon.blog.entity.SystemOperation;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 系统操作
 */
public interface OperationMapper {
    SystemOperation findOperationByOperationId(@PathVariable("operationId") int operationId);
}
