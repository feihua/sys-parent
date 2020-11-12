package com.liufeihua.sys.api.service;

import java.util.List;

import com.liufeihua.sys.api.bean.SysRoleResources;
import com.liufeihua.sys.common.page.PageBean;
import com.liufeihua.sys.common.page.PageInfoVo;

/**
 * 描述: 角色资源操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
public interface SysRoleResourcesService {

	/**
	 * 查询角色资源
	 *
	 * @return PageInfo<SysRoleResources>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	PageInfoVo<SysRoleResources> list(PageBean pageBean);

	/**
	 * 根据id查询角色资源
	 *
	 * @param id 主键
	 * @return SysRoleResources
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:16
	 */
	List<Integer> findById(Integer id);

	/**
	 * 添加角色资源
	 *
	 * @param user 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:37
	 */
	Integer add(SysRoleResources user);

	/**
	 * 删除角色资源
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:39
	 */
	Integer deleteById(Integer id);

	/**
	 * 更新角色资源
	 *
	 * @param user 角色资源
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:40
	 */
	Integer updateRoleResource(SysRoleResources user);
}
