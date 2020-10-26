package com.liufeihua.sys.provider.dao;

import com.liufeihua.sys.api.bean.SysRoleResources;

public interface SysRoleResourcesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleResources record);

    int insertSelective(SysRoleResources record);

    SysRoleResources selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleResources record);

    int updateByPrimaryKey(SysRoleResources record);
}