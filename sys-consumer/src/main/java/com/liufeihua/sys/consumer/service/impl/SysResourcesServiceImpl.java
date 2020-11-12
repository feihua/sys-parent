package com.liufeihua.sys.consumer.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import com.liufeihua.sys.api.bean.SysResources;
import com.liufeihua.sys.api.service.SysResourcesService;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.common.response.ElementTreeTableVo;
import com.liufeihua.sys.common.response.ElementTreeVo;
import com.liufeihua.sys.consumer.service.ResourcesService;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/15 9:33
 */
@Service
public class SysResourcesServiceImpl implements ResourcesService {

	@DubboReference
	private SysResourcesService resourcesService;

	/**
	 * 根据资源名查询资源
	 *
	 * @param item 参数
	 * @return PageInfo<SysResources>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	@Override
	public PageInfoVo<ElementTreeTableVo> list(SysResources item) {

		return resourcesService.list(item);
	}

	/**
	 * 根据id查询资源
	 *
	 * @param id 主键
	 * @return SysResources
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:16
	 */
	@Override
	public SysResources findById(Integer id) {
		return resourcesService.findById(id);
	}

	/**
	 * 添加资源
	 *
	 * @param resourcesRequestVO 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:37
	 */
	@Override
	public Integer add(SysResources resourcesRequestVO) {
		return resourcesService.add(resourcesRequestVO);
	}

	/**
	 * 删除资源
	 *
	 * @param id 主键
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:39
	 */
	@Override
	public Integer deleteById(Integer id) {
		return resourcesService.deleteById(id);
	}

	/**
	 * 更新资源
	 *
	 * @param resourcesRequestVO 资源
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:40
	 */
	@Override
	public Integer updateById(SysResources resourcesRequestVO) {
		return resourcesService.updateById(resourcesRequestVO);
	}
}