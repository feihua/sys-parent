package com.liufeihua.sys.consumer.controller;//package com.liufeihua.mall.pc.controller.system;

import io.swagger.annotations.Api;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liufeihua.sys.api.bean.SysRoleResources;
import com.liufeihua.sys.common.response.CommonRespData;
import com.liufeihua.sys.consumer.service.RoleResourcesService;

/**
 * 描述: 角色资源操作
 * 作者: 刘飞华
 * 日期: 2019/5/6 11:40
 */
@Api(tags = "系统管理-角色资源管理")
@RestController
@RequestMapping("/roleResources")
public class SysRoleResourcesController {

	/** 角色资源操作 */
	@Autowired
	private RoleResourcesService roleResourcesService;

	//    /**
	//     * 查询角色资源
	//     *
	//     * @param pageBean 参数
	//     * @return CommonRespData<PageInfo < SysRoleResources>>
	//     * @author: 刘飞华
	//     * @date: 2019/5/6 9:12
	//     */
	//    @PostMapping("/list")
	//    public CommonRespData<PageInfoVo<SysRoleResources>> list(@RequestBody PageBean pageBean) {
	//        return CommonRespData.success(roleResourcesFeign.list(pageBean);
	//    }
	//
	//    /**
	//     * 添加角色资源
	//     *
	//     * @param roleResources 参数
	//     * @return CommonRespData<PageInfo < SysRoleResources>>
	//     * @author: 刘飞华
	//     * @date: 2019/5/6 9:12
	//     */
	//    @PostMapping("/add")
	//    public CommonRespData<Integer> add(@RequestBody SysRoleResources roleResources) {
	//        return CommonRespData.success(roleResourcesFeign.add(roleResources);
	//    }
	//
	//    /**
	//     * 删除角色资源
	//     *
	//     * @param id 主键
	//     * @return CommonRespData<Integer>
	//     * @author: 刘飞华
	//     * @date: 2019/5/6 9:12
	//     */
	//    @DeleteMapping("/delete/{id}")
	//    public CommonRespData<Integer> deleteById(@PathVariable("id") Integer id) {
	//        return CommonRespData.success(roleResourcesFeign.deleteById(id);
	//    }
	//
	//    /**
	//     * 更新角色资源
	//     *
	//     * @param roleResources 参数
	//     * @return CommonRespData<Integer>
	//     * @author: 刘飞华
	//     * @date: 2019/5/6 9:12
	//     */
	@PostMapping("/updateRoleResource")
	public CommonRespData<Integer> updateRoleResource(@RequestBody SysRoleResources roleResources) {
		return CommonRespData.success(roleResourcesService.updateRoleResource(roleResources));
	}

	    /**
	     * 根据id查询角色资源
	     *
	     * @param id 主键
	     * @return CommonRespData<SysRoleResources>
	     * @author: 刘飞华
	     * @date: 2019/5/6 9:14
	     */
	    @GetMapping("/find/{id}")
	    public CommonRespData<List<Integer>> find(@PathVariable("id") Integer id) {
	        return CommonRespData.success(roleResourcesService.findById(id));
	    }
}