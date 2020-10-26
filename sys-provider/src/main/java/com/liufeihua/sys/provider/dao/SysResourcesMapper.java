package com.liufeihua.sys.provider.dao;

import java.util.List;

import com.liufeihua.sys.api.bean.SysResources;

public interface SysResourcesMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(SysResources record);

	int insertSelective(SysResources record);

	SysResources selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SysResources record);

	int updateByPrimaryKey(SysResources record);

	List<SysResources> list(SysResources resourcesVo);
}