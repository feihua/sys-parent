package com.liufeihua.sys.provider.service.iml;

import java.util.Date;
import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liufeihua.sys.api.bean.SysUserRole;
import com.liufeihua.sys.api.service.SysUserRoleService;
import com.liufeihua.sys.common.page.PageBean;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.provider.dao.SysUserRoleMapper;

/**
 * 描述: 用户角色操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
@DubboService
public class SysUserRoleServiceImpl implements SysUserRoleService {

	/** 用户角色操作 */
	@Autowired
	private SysUserRoleMapper userRoleMapper;

	/**
	 * 根据用户角色名查询用户角色
	 *
	 * @param pageBean 参数
	 * @return PageInfo<SysUserRole>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	@Override
	public PageInfoVo<SysUserRole> list(PageBean pageBean) {

		PageHelper.startPage(pageBean.getPageNum(), pageBean.getPageSize());
		List<SysUserRole> list = userRoleMapper.list();

		PageInfo<SysUserRole> info = new PageInfo<>(list);
		return new PageInfoVo<>(info.getList(), info.getTotal());
	}

	/**
	 * 添加用户角色
	 *
	 * @param userRole 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:37
	 */
	@Override
	public Integer add(SysUserRole userRole) {
		userRole.setCreateTime(new Date());
		userRole.setCreateBy(1);
		return userRoleMapper.insertSelective(userRole);
	}

	/**
	 * 删除用户角色
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:39
	 */
	@Override
	public Integer deleteById(Integer id) {
		return userRoleMapper.deleteByUserId(id);
	}

	/**
	 * 更新用户角色
	 *
	 * @param userRole 用户角色
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:40
	 */
	@Override
	public Integer updateUserRole(SysUserRole userRole) {
		userRole.setCreateBy(1);
		userRole.setCreateTime(new Date());
//		先删除
		userRoleMapper.deleteByUserId(userRole.getUserId());
//		后添加
		return userRoleMapper.insertSelective(userRole);
	}

	/**
	 * 根据id查询用户角色
	 *
	 * @param id 主键
	 * @return SysUserRole
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:16
	 */
	@Override
	public SysUserRole findById(Integer id) {
		return userRoleMapper.selectByPrimaryKey(id);
	}
}