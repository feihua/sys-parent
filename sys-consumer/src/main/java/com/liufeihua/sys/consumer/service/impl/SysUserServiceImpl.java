package com.liufeihua.sys.consumer.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import com.liufeihua.sys.api.bean.SysUser;
import com.liufeihua.sys.api.service.SysUserService;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.consumer.service.UserService;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/15 9:33
 */
@Service
public class SysUserServiceImpl implements UserService {

	@DubboReference
	private SysUserService userService;

	/**
	 * 根据用户名,手机号码,email查询用户
	 *
	 * @param queryVO 参数
	 * @return PageInfo<SysUser>
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:38
	 */
	@Override
	public PageInfoVo<SysUser> list(SysUser queryVO) {

		return userService.list(queryVO);
	}

	/**
	 * 根据id查询用户
	 *
	 * @param id 主键
	 * @return SysUser
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:16
	 */
	@Override
	public SysUser findById(Integer id) {
		return userService.findById(id);
	}

	/**
	 * 添加用户
	 *
	 * @param userRequestVO 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:37
	 */
	@Override
	public Integer add(SysUser userRequestVO) {
		return userService.add(userRequestVO);
	}

	/**
	 * 删除用户
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:39
	 */
	@Override
	public Integer deleteById(Integer id) {
		return userService.deleteById(id);
	}

	/**
	 * 更新用户
	 *
	 * @param userRequestVO 用户
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:40
	 */
	@Override
	public Integer updateById(SysUser userRequestVO) {

		return userService.updateById(userRequestVO);
	}
}