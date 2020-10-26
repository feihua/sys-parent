package com.liufeihua.sys.consumer.controller;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liufeihua.sys.api.bean.SysResources;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.common.response.CommonRespData;
import com.liufeihua.sys.common.response.ElementTreeVo;
import com.liufeihua.sys.consumer.service.ResourcesService;

/**
 * 描述: 资源操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
@Api(tags = "系统管理-资源管理")
@RestController
@RequestMapping("/resources")
public class SysResourcesController {

	/** 资源操作 */
	@Autowired
	private ResourcesService resourcesService;

	/**
	 * 根据资源名查询资源
	 *
	 * @param resourcesVo 参数
	 * @return CommonRespData<PageInfo               <               SysResources>>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:12
	 */
	@PostMapping("/list")
	public CommonRespData<PageInfoVo<ElementTreeVo>> list(@RequestBody SysResources resourcesVo) {
		return CommonRespData.success(resourcesService.list(resourcesVo));
	}

	/**
	 * 添加资源
	 *
	 * @param resources 参数
	 * @return CommonRespData<PageInfo               <               SysResources>>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:12
	 */
	@PostMapping("/add")
	public CommonRespData<Integer> add(@RequestBody SysResources resources) {
		return CommonRespData.success(resourcesService.add(resources));
	}

	/**
	 * 删除资源
	 *
	 * @param id 主键
	 * @return CommonRespData<Integer>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:12
	 */
	@DeleteMapping("/delete/{id}")
	public CommonRespData<Integer> deleteById(@PathVariable("id") Integer id) {
		return CommonRespData.success(resourcesService.deleteById(id));
	}

	/**
	 * 更新资源
	 *
	 * @param resources 参数
	 * @return CommonRespData<Integer>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:12
	 */
	@PutMapping("/update")
	public CommonRespData<Integer> updateById(@RequestBody SysResources resources) {
		return CommonRespData.success(resourcesService.updateById(resources));
	}

	/**
	 * 根据id查询资源
	 *
	 * @param id 主键
	 * @return CommonRespData<SysResources>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:14
	 */
	@GetMapping("/find/{id}")
	public CommonRespData<SysResources> find(@PathVariable("id") Integer id) {
		return CommonRespData.success(resourcesService.findById(id));
	}
}