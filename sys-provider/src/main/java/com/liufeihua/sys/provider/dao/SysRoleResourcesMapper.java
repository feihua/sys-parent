package com.liufeihua.sys.provider.dao;

import java.util.List;

import com.liufeihua.sys.api.bean.SysRoleResources;

public interface SysRoleResourcesMapper {
	int deleteByRoleId(Integer id);

	int insert(SysRoleResources record);

	int insertSelective(SysRoleResources record);

	List<SysRoleResources> selectByRoleId(Integer id);

	int updateByPrimaryKeySelective(SysRoleResources record);

	int updateByPrimaryKey(SysRoleResources record);

	List<SysRoleResources> list();

}