package com.liufeihua.sys.api.service;

import com.liufeihua.sys.api.bean.SysResources;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.common.response.ElementTreeTableVo;
import com.liufeihua.sys.common.response.ElementTreeVo;

/**
 * 描述: 资源操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
public interface SysResourcesService {

	/**
	 * 根据资源名查询资源
	 *
	 * @param resourcesVo 参数
	 * @return PageInfo<SysResources>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	PageInfoVo<ElementTreeTableVo> list(SysResources resourcesVo);

	/**
	 * 根据id查询资源
	 *
	 * @param id 主键
	 * @return SysResources
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:16
	 */
	SysResources findById(Integer id);

	/**
	 * 添加资源
	 *
	 * @param resources 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:37
	 */
	Integer add(SysResources resources);

	/**
	 * 删除资源
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:39
	 */
	Integer deleteById(Integer id);

	/**
	 * 更新资源
	 *
	 * @param resources 资源
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:40
	 */
	Integer updateById(SysResources resources);
}
