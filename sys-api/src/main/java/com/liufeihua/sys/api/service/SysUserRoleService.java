package com.liufeihua.sys.api.service;

import com.liufeihua.sys.api.bean.SysUserRole;
import com.liufeihua.sys.common.page.PageBean;
import com.liufeihua.sys.common.page.PageInfoVo;

/**
 * 描述: 用户角色操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
public interface SysUserRoleService {

	/**
	 * 根据用户角色名查询用户角色
	 *
	 * @param pageBean 参数
	 * @return PageInfo<SysUserRole>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	PageInfoVo<SysUserRole> list(PageBean pageBean);

	/**
	 * 根据id查询用户角色
	 *
	 * @param id 主键
	 * @return SysUserRole
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:16
	 */
	SysUserRole findById(Integer id);

	/**
	 * 添加用户角色
	 *
	 * @param userRole 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:37
	 */
	Integer add(SysUserRole userRole);

	/**
	 * 删除用户角色
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:39
	 */
	Integer deleteById(Integer id);

	/**
	 * 更新用户角色
	 *
	 * @param userRole 用户角色
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:40
	 */
	Integer updateById(SysUserRole userRole);
}
