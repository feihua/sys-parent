package com.liufeihua.sys.consumer.controller;
import com.google.common.collect.Lists;
import com.liufeihua.sys.consumer.controller.Meta;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
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
		result.put("code", "000000");
		result.put("data", "admin-token");

		return result;
	}

	@GetMapping("/info")
	public Map<String, Object> info() {

		ResrouceMenu a=new ResrouceMenu();
		a.setId(21);
		a.setParentId(0);
		a.setTitle("系统管理");
		a.setLevel(0);
		a.setSort(0);
		a.setName("系统管理");
		a.setIcon("example");
		a.setHidden(0);
		a.setPath("/sys");
		a.setRedirect("/sys/userList");
		a.setComponent("Layout");
		a.setType(1);
		a.setStatus(0);
		a.setMeta(Meta.builder().title("系统管理").icon("example").build());

		ResrouceMenu b=new ResrouceMenu();
		b.setId(22);
		b.setParentId(21);
		b.setTitle("用户");
		b.setLevel(0);
		b.setSort(0);
		b.setName("用户");
		b.setIcon("example");
		b.setHidden(0);
		b.setPath("/userList");
		b.setComponent("system/user/index");
		b.setType(1);
		b.setStatus(0);
		b.setMeta(Meta.builder().title("用户").icon("example").build());

		ResrouceMenu c=new ResrouceMenu();
		c.setId(23);
		c.setParentId(21);
		c.setTitle("角色");
		c.setLevel(0);
		c.setSort(0);
		c.setName("角色");
		c.setIcon("example");
		c.setHidden(0);
		c.setPath("/roleList");
		c.setComponent("system/role/index");
		c.setType(1);
		c.setStatus(0);
		c.setMeta(Meta.builder().title("角色").icon("example").build());

		ResrouceMenu d=new ResrouceMenu();
		d.setId(23);
		d.setParentId(21);
		d.setTitle("权限");
		d.setLevel(0);
		d.setSort(0);
		d.setName("权限");
		d.setIcon("example");
		d.setHidden(0);
		d.setPath("/resourcesList");
		d.setComponent("system/resource/index");
		d.setType(1);
		d.setStatus(0);
		d.setMeta(Meta.builder().title("权限").icon("example").build());


		ResrouceMenu a1=new ResrouceMenu();
		a1.setId(25);
		a1.setParentId(0);
		a1.setTitle("系统监控");
		a1.setLevel(0);
		a1.setSort(0);
		a1.setName("系统监控");
		a1.setIcon("example");
		a1.setHidden(0);
		a1.setPath("/item");
		a1.setRedirect("/item/list");
		a1.setComponent("Layout");
		a1.setType(1);
		a1.setStatus(0);
		a1.setMeta(Meta.builder().title("系统监控").icon("example").build());

		ResrouceMenu b1=new ResrouceMenu();
		b1.setId(26);
		b1.setParentId(25);
		b1.setTitle("系统日志");
		b1.setLevel(0);
		b1.setSort(0);
		b1.setName("系统日志");
		b1.setIcon("example");
		b1.setHidden(0);
		b1.setPath("/cat");
		b1.setComponent("item/cat");
		b1.setType(1);
		b1.setStatus(0);
		b1.setMeta(Meta.builder().title("系统日志").icon("example").build());

		ArrayList<ResrouceMenu> list = new ArrayList<>(3);
		list.add(b);
		list.add(c);
		list.add(d);
		a.setChildren(list);


		ArrayList<ResrouceMenu> list2 = new ArrayList<>(3);
		list2.add(b1);
		a1.setChildren(list2);

		HashMap<String, Object> data = new HashMap<>();
		data.put("roles", "['admin']");
		data.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
		data.put("name", "Super Admin");
		data.put("introduction", "I am a super administrator");
		ArrayList<ResrouceMenu> list3 = new ArrayList<>(2);

		list3.add(a);
		list3.add(a1);
		data.put("resources", list3);


		HashMap<String, Object> result = new HashMap<>();
		result.put("code", "000000");


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
	@GetMapping("/delete/{id}")
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
	@PostMapping("/update")
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