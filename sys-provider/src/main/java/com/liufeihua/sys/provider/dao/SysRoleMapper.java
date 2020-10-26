package com.liufeihua.sys.provider.dao;

import java.util.List;

import com.liufeihua.sys.api.bean.SysRole;

public interface SysRoleMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(SysRole record);

	int insertSelective(SysRole record);

	SysRole selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysRole record);

	int updateByPrimaryKey(SysRole record);

	List<SysRole> list(SysRole roleVo);
}