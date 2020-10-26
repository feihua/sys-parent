package com.liufeihua.sys.api.service;

import com.liufeihua.sys.api.bean.SysUser;
import com.liufeihua.sys.common.page.PageInfoVo;

/**
 * 描述: 用户操作
 * 作者: 刘飞华
 * 日期: 2019/4/26 11:40
 */
public interface SysUserService {

	/**
	 * 根据用户名,手机号码,email查询用户
	 *
	 * @param userVo 参数
	 * @return PageInfo<SysUser>
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:38
	 */
	PageInfoVo<SysUser> list(SysUser userVo);

	/**
	 * 根据id查询用户
	 *
	 * @param id 主键
	 * @return SysUser
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:16
	 */
	SysUser findById(Integer id);

	/**
	 * 添加用户
	 *
	 * @param user 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:37
	 */
	Integer add(SysUser user);

	/**
	 * 删除用户
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:39
	 */
	Integer deleteById(Integer id);

	/**
	 * 更新用户
	 *
	 * @param user 用户
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:40
	 */
	Integer updateById(SysUser user);
}
