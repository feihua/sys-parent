package com.liufeihua.sys.provider.service.iml;

import java.util.Date;
import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liufeihua.sys.api.bean.SysRoleResources;
import com.liufeihua.sys.api.service.SysRoleResourcesService;
import com.liufeihua.sys.common.page.PageBean;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.provider.dao.SysRoleResourcesMapper;

/**
 * 描述: 角色资源操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
@DubboService
public class SysRoleResourcesServiceImpl implements SysRoleResourcesService {

	/** 角色资源操作 */
	@Autowired
	private SysRoleResourcesMapper roleResourcesMapper;

	/**
	 * 根据角色资源名,手机号码,email查询角色资源
	 *
	 * @return PageInfo<SysRoleResources>
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:38
	 */
	@Override
	public PageInfoVo<SysRoleResources> list(PageBean pageBean) {

		PageHelper.startPage(pageBean.getPageNum(), pageBean.getPageSize());
		List<SysRoleResources> list = roleResourcesMapper.list();

		PageInfo<SysRoleResources> info = new PageInfo<>(list);
		return new PageInfoVo<>(info.getList(), info.getTotal());
	}

	/**
	 * 添加角色资源
	 *
	 * @param roleResources 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:37
	 */
	@Override
	public Integer add(SysRoleResources roleResources) {
		roleResources.setCreateTime(new Date());
		roleResources.setCreateBy(1);
		return roleResourcesMapper.insertSelective(roleResources);
	}

	/**
	 * 删除角色资源
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:39
	 */
	@Override
	public Integer deleteById(Integer id) {
		return roleResourcesMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新角色资源
	 *
	 * @param roleResources 角色资源
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:40
	 */
	@Override
	public Integer updateById(SysRoleResources roleResources) {
		return roleResourcesMapper.updateByPrimaryKeySelective(roleResources);
	}

	/**
	 * 根据id查询角色资源
	 *
	 * @param id 主键
	 * @return SysRoleResources
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:16
	 */
	@Override
	public SysRoleResources findById(Integer id) {
		return roleResourcesMapper.selectByPrimaryKey(id);
	}
}