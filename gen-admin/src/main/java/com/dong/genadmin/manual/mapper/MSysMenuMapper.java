package com.dong.genadmin.manual.mapper;

import com.dong.genadmin.generator.model.SysMenu;

import java.util.List;

/**
 * @Classname MSysMenuMapper
 * @Description TODO
 * @Date 2019/10/2 12:32
 * @Created by dong
 */
public interface MSysMenuMapper {
    /**
     * 查询角色菜单
     * @param roleId
     * @return
     */
    List<SysMenu> findRoleMenus(Long roleId);

    List<SysMenu> findAll();
}
