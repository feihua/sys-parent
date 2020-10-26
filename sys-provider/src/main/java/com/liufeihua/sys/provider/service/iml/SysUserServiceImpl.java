package com.liufeihua.sys.provider.service.iml;

import java.util.Date;
import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liufeihua.sys.api.bean.SysUser;
import com.liufeihua.sys.api.service.SysUserService;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.provider.dao.SysUserMapper;

/**
 * 描述: 用户操作
 * 作者: 刘飞华
 * 日期: 2019/4/26 11:40
 */
@DubboService
public class SysUserServiceImpl implements SysUserService {

	/** 用户操作 */
	@Autowired
	private SysUserMapper userMapper;

	/**
	 * 根据用户名,手机号码,email查询用户
	 *
	 * @param userVo 参数
	 * @return PageInfo<SysUser>
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:38
	 */
	@Override
	public PageInfoVo<SysUser> list(SysUser userVo) {

		PageHelper.startPage(userVo.getPageNum(), userVo.getPageSize());
		List<SysUser> list = userMapper.list(userVo);

		PageInfo<SysUser> info = new PageInfo<>(list);
		return new PageInfoVo<>(info.getList(), info.getTotal());
	}

	/**
	 * 添加用户
	 *
	 * @param user 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:37
	 */
	@Override
	public Integer add(SysUser user) {
		user.setCreateTime(new Date());
		user.setPassword("123456");
		user.setCreateBy(1);
		return userMapper.insertSelective(user);
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
		return userMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新用户
	 *
	 * @param user 用户
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:40
	 */
	@Override
	public Integer updateById(SysUser user) {
		return userMapper.updateByPrimaryKeySelective(user);
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
		return userMapper.selectByPrimaryKey(id);
	}
}