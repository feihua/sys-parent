package com.liufeihua.sys.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liufeihua.sys.api.bean.SysUser;

@Mapper
public interface SysUserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(SysUser record);

	int insertSelective(SysUser record);

	SysUser selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysUser record);

	int updateByPrimaryKey(SysUser record);

	List<SysUser> list(SysUser userVo);

}