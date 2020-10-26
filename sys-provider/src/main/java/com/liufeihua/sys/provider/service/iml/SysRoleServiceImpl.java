package com.liufeihua.sys.provider.service.iml;

import java.util.Date;
import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liufeihua.sys.api.bean.SysRole;
import com.liufeihua.sys.api.service.SysRoleService;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.provider.dao.SysRoleMapper;

/**
 * 描述: 角色操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
@DubboService
public class SysRoleServiceImpl implements SysRoleService {

	/** 角色操作 */
	@Autowired
	private SysRoleMapper roleMapper;

	/**
	 * 根据角色名,手机号码,email查询角色
	 *
	 * @param roleVo 参数
	 * @return PageInfo<SysRole>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	@Override
	public PageInfoVo<SysRole> list(SysRole roleVo) {

		PageHelper.startPage(roleVo.getPageNum(), roleVo.getPageSize());
		List<SysRole> list = roleMapper.list(roleVo);

		PageInfo<SysRole> info = new PageInfo<>(list);
		return new PageInfoVo<>(info.getList(), info.getTotal());
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
		role.setCreateTime(new Date());
		role.setCreateBy(1);
		return roleMapper.insertSelective(role);
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
		return roleMapper.deleteByPrimaryKey(id);
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
		return roleMapper.updateByPrimaryKeySelective(role);
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
		return roleMapper.selectByPrimaryKey(id);
	}
}