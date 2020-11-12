package com.liufeihua.sys.provider.service.iml;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liufeihua.sys.api.bean.SysResources;
import com.liufeihua.sys.api.service.SysResourcesService;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.common.response.ElementTreeTableVo;
import com.liufeihua.sys.provider.dao.SysResourcesMapper;

/**
 * 描述: 资源操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
@DubboService
public class SysResourcesServiceImpl implements SysResourcesService {

	/** 资源操作 */
	@Autowired
	private SysResourcesMapper resourcesMapper;

	/**
	 * 根据资源名查询资源
	 *
	 * @param resourcesVo 参数
	 * @return PageInfo<SysResources>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:38
	 */
	@Override
	public PageInfoVo<ElementTreeTableVo> list(SysResources resourcesVo) {

		PageHelper.startPage(resourcesVo.getPageNum(), resourcesVo.getPageSize());
		List<SysResources> list = resourcesMapper.list(resourcesVo);

		//第一级菜单
		List<ElementTreeTableVo> parentList = new ArrayList<>();

		for (SysResources sysResources : list) {
			if (sysResources.getPid() == 0) {

				parentList.add(ElementTreeTableVo.builder().id(sysResources.getId().intValue())
						.name(sysResources.getName()).createBy(sysResources.getCreateBy())
						.createTime(sysResources.getCreateTime()).remarks(sysResources.getRemarks()).build());
			}
		}

		PageInfo<ElementTreeTableVo> info = new PageInfo<>(getChildren(list, parentList));
		return new PageInfoVo<>(info.getList(), info.getTotal());
	}

	private List<ElementTreeTableVo> getChildren(List<SysResources> list, List<ElementTreeTableVo> parentList) {
		for (ElementTreeTableVo treeVo : parentList) {
			ArrayList<ElementTreeTableVo> children = new ArrayList<>();
			for (SysResources tbItemCat : list) {
				if (treeVo.getId() == tbItemCat.getPid()) {

					children.add(
							ElementTreeTableVo.builder().id(tbItemCat.getId().intValue())
									.name(tbItemCat.getName()).createBy(tbItemCat.getCreateBy())
									.createTime(tbItemCat.getCreateTime()).remarks(tbItemCat.getRemarks()).build());
				}
				treeVo.setChildren(children);
			}
			getChildren(list, treeVo.getChildren());
		}
		return parentList;

	}

	/**
	 * 添加资源
	 *
	 * @param resources 参数
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:37
	 */
	@Override
	public Integer add(SysResources resources) {
		resources.setCreateTime(new Date());
		resources.setCreateBy(1);
		return resourcesMapper.insertSelective(resources);
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
		return resourcesMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 更新资源
	 *
	 * @param resources 资源
	 * @return Integer
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:40
	 */
	@Override
	public Integer updateById(SysResources resources) {
		return resourcesMapper.updateByPrimaryKeySelective(resources);
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
		return resourcesMapper.selectByPrimaryKey(id);
	}
}