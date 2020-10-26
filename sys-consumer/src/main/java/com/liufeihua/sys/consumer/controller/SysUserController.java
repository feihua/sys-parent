package com.liufeihua.sys.consumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liufeihua.sys.api.bean.SysUser;
import com.liufeihua.sys.common.page.PageInfoVo;
import com.liufeihua.sys.common.response.CommonRespData;
import com.liufeihua.sys.consumer.service.UserService;

/**
 * 描述: 测试类
 * 作者: 刘飞华
 * 日期: 2019/4/25 14:05
 */
@Api(tags = "系统管理-用户管理")
@RestController
@RequestMapping("/user")
public class SysUserController {

	@Autowired
	UserService userService;

	@PostMapping("/login")
	public Map<String, Object> login() {

		HashMap<String, Object> result = new HashMap<>();
		result.put("code", 20000);
		result.put("data", "admin-token");

		return result;
	}

	@GetMapping("/info")
	public Map<String, Object> info() {

		HashMap<String, Object> data = new HashMap<>();
		data.put("roles", "['admin']");
		data.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
		data.put("name", "Super Admin");
		data.put("introduction", "I am a super administrator");

		HashMap<String, Object> result = new HashMap<>();
		result.put("code", 20000);
		result.put("data", data);

		return result;
	}

	@ApiOperation(value = "查询所有用户", notes = "查询所有用户", httpMethod = "POST")
	@PostMapping("/list")
	public CommonRespData<PageInfoVo<SysUser>> list(@RequestBody SysUser vo) {

		return CommonRespData.success(userService.list(vo));
	}

	/**
	 * 添加用户
	 *
	 * @param user 参数
	 * @return CommonRespData<PageInfo                               <                               SysUser>>
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:12
	 */
	@PostMapping("/add")
	public CommonRespData<Integer> add(@RequestBody SysUser user) {
		return CommonRespData.success(userService.add(user));
	}

	/**
	 * 删除用户
	 *
	 * @param id 主键
	 * @return CommonRespData<Integer>
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:12
	 */
	@DeleteMapping("/delete/{id}")
	public CommonRespData<Integer> deleteById(@PathVariable("id") Integer id) {
		return CommonRespData.success(userService.deleteById(id));
	}

	/**
	 * 更新用户
	 *
	 * @param user 参数
	 * @return CommonRespData<Integer>
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:12
	 */
	@PutMapping("/update")
	public CommonRespData<Integer> updateById(@RequestBody SysUser user) {
		return CommonRespData.success(userService.updateById(user));
	}

	/**
	 * 根据id查询用户
	 *
	 * @param id 主键
	 * @return CommonRespData<SysUser>
	 * @author: 刘飞华
	 * @date: 2019/4/28 9:14
	 */
	@GetMapping("/find/{id}")
	public CommonRespData<SysUser> find(@PathVariable("id") Integer id) {
		return CommonRespData.success(userService.findById(id));
	}
}