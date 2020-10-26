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

import com.liufeihua.sys.api.bean.SysRole;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.common.response.CommonRespData;
import com.liufeihua.sys.consumer.service.RoleService;

/**
 * 描述: 角色操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
@Api(tags = "系统管理-角色管理")
@RestController
@RequestMapping("/role")
public class SysRoleController {

	/** 角色操作 */
	@Autowired
	private RoleService roleService;

	/**
	 * 根据角色名查询角色
	 *
	 * @param roleVo 参数
	 * @return CommonRespData<PageInfo               <               SysRole>>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:12
	 */
	@PostMapping("/list")
	public CommonRespData<PageInfoVo<SysRole>> list(@RequestBody SysRole roleVo) {
		return CommonRespData.success(roleService.list(roleVo));
	}

	/**
	 * 添加角色
	 *
	 * @param role 参数
	 * @return CommonRespData<PageInfo               <               SysRole>>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:12
	 */
	@PostMapping("/add")
	public CommonRespData<Integer> add(@RequestBody SysRole role) {
		return CommonRespData.success(roleService.add(role));
	}

	/**
	 * 删除角色
	 *
	 * @param id 主键
	 * @return CommonRespData<Integer>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:12
	 */
	@DeleteMapping("/delete/{id}")
	public CommonRespData<Integer> deleteById(@PathVariable("id") Integer id) {
		return CommonRespData.success(roleService.deleteById(id));
	}

	/**
	 * 更新角色
	 *
	 * @param role 参数
	 * @return CommonRespData<Integer>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:12
	 */
	@PutMapping("/update")
	public CommonRespData<Integer> updateById(@RequestBody SysRole role) {
		return CommonRespData.success(roleService.updateById(role));
	}

	/**
	 * 根据id查询角色
	 *
	 * @param id 主键
	 * @return CommonRespData<SysRole>
	 * @author: 刘飞华
	 * @date: 2019/5/6 9:14
	 */
	@GetMapping("/find/{id}")
	public CommonRespData<SysRole> find(@PathVariable("id") Integer id) {
		return CommonRespData.success(roleService.findById(id));
	}
}