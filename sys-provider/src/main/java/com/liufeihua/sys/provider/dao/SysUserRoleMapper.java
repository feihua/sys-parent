package com.liufeihua.sys.provider.dao;

import java.util.List;

import com.liufeihua.sys.api.bean.SysUserRole;

public interface SysUserRoleMapper {
	int deleteByUserId(Integer id);

	int insert(SysUserRole record);

	int insertSelective(SysUserRole record);

	SysUserRole selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysUserRole record);

	int updateByPrimaryKey(SysUserRole record);

	List<SysUserRole> list();

}