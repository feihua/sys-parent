package com.liufeihua.sys.consumer.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liufeihua.sys.api.bean.SysUserRole;
import com.liufeihua.sys.api.service.SysUserRoleService;
import com.liufeihua.sys.consumer.service.UserRoleService;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/27 10:19
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

	@DubboReference
	private SysUserRoleService userRoleService;

	/**
	 * 更新用户角色
	 * @param userRole 用户id和角色id
	 * @return
	 * @author liufeihua
	 * @date 2020/10/27 10:18
	 */
	@Override
	public int updateUserRole(SysUserRole userRole) {
		return userRoleService.updateUserRole(userRole);
	}
}