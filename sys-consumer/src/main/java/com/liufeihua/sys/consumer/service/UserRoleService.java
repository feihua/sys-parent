package com.liufeihua.sys.consumer.service;

import com.liufeihua.sys.api.bean.SysUserRole;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/27 10:16
 */
public interface UserRoleService {
	/**
	* 更新用户角色
	* @param userRole 用户id和角色id
	* @return
	* @author liufeihua
	* @date 2020/10/27 10:18
	*/
	int updateUserRole(SysUserRole userRole);
}
