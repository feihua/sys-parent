package com.liufeihua.sys.consumer.service;

import java.util.List;

import com.liufeihua.sys.api.bean.SysRoleResources;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/27 10:54
 */
public interface RoleResourcesService {

	/**
	* 更新角色资源
	* @param
	* @return
	* @author liufeihua
	* @date 2020/10/27 10:55
	*/
	int updateRoleResource(SysRoleResources roleResources);

	List<Integer> findById(Integer id);
}
