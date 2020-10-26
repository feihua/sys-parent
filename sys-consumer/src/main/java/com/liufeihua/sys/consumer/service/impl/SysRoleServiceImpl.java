package com.liufeihua.sys.consumer.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import com.liufeihua.sys.api.bean.SysRole;
import com.liufeihua.sys.api.service.SysRoleService;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.consumer.service.RoleService;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/15 9:33
 */
@Service
public class SysRoleServiceImpl implements RoleService {

	@DubboReference
	private SysRoleService roleService;

	/**
	 * 根据角色名查询
	 *
	 * @param roleVo 参数
	 * @return PageInfo<SysRole>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	@Override
	public PageInfoVo<SysRole> list(SysRole roleVo) {

		return roleService.list(roleVo);
	}

	/**
	 * 根据id查询角色
	 *
	 * @param id 主键
	 * @return SysRole
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:16
	 */
	@Override
	public SysRole findById(Integer id) {
		return roleService.findById(id);
	}

	/**
	 * 添加角色
	 *
	 * @param role 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:37
	 */
	@Override
	public Integer add(SysRole role) {
		return roleService.add(role);
	}

	/**
	 * 删除角色
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:39
	 */
	@Override
	public Integer deleteById(Integer id) {
		return roleService.deleteById(id);
	}

	/**
	 * 更新角色
	 *
	 * @param role 角色
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:40
	 */
	@Override
	public Integer updateById(SysRole role) {
		return roleService.updateById(role);
	}
}