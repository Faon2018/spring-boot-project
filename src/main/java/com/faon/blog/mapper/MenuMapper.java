package com.faon.blog.mapper;

import com.faon.blog.entity.SystemMenu;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 系统菜单
 */
public interface MenuMapper {
    SystemMenu findMenuByMenuId(@PathVariable("menuId") int menuId);

    SystemMenu selectMenuChildren(@PathVariable("id") int id);
}
