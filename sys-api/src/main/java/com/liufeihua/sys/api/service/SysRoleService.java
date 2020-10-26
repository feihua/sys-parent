package com.liufeihua.sys.api.service;

import com.liufeihua.sys.api.bean.SysRole;
import com.liufeihua.sys.common.page.PageInfoVo;

/**
 * 描述: 角色操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
public interface SysRoleService {

	/**
	 * 根据角色名查询
	 *
	 * @param roleVo 参数
	 * @return PageInfo<SysRole>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	PageInfoVo<SysRole> list(SysRole roleVo);

	/**
	 * 根据id查询角色
	 *
	 * @param id 主键
	 * @return SysRole
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:16
	 */
	SysRole findById(Integer id);

	/**
	 * 添加角色
	 *
	 * @param role 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:37
	 */
	Integer add(SysRole role);

	/**
	 * 删除角色
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:39
	 */
	Integer deleteById(Integer id);

	/**
	 * 更新角色
	 *
	 * @param role 角色
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:40
	 */
	Integer updateById(SysRole role);
}
