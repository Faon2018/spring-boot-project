package com.faon.blog.mapper;

import com.faon.blog.entity.SystemMenu;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 系统菜单
 */
public interface MenuMapper {
    SystemMenu findMenuByMenuId(@PathVariable("menuId") int menuId);

    List<SystemMenu> selectMenuChildren(@PathVariable("id") int id);

    SystemMenu selectMenuParent(@PathVariable("parentId") int parentId);
}
