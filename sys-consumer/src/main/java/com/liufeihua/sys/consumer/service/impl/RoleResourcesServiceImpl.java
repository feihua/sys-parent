package com.liufeihua.sys.consumer.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liufeihua.sys.api.bean.SysRoleResources;
import com.liufeihua.sys.api.service.SysRoleResourcesService;
import com.liufeihua.sys.consumer.service.RoleResourcesService;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/27 10:56
 */
@Service
public class RoleResourcesServiceImpl implements RoleResourcesService {

	@DubboReference
	private SysRoleResourcesService roleResourcesService;

	/**
	 * 更新角色资源
	 *
	 * @param roleResources@return
	 * @author liufeihua
	 * @date 2020/10/27 10:55
	 */
	@Override
	public int updateRoleResource(SysRoleResources roleResources) {
		return roleResourcesService.updateRoleResource(roleResources);
	}

	@Override
	public List<Integer> findById(Integer id) {
		return roleResourcesService.findById(id);
	}
}