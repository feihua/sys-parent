package com.liufeihua.sys.consumer.controller;//package com.liufeihua.mall.pc.controller.system;
//
//import io.swagger.annotations.Api;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.liufeihua.mall.utils.page.PageBean;
//import com.liufeihua.mall.utils.response.CommonRespData;
//
///**
// * 描述: 用户角色操作
// * 作者: 刘飞华
// * 日期: 2019/5/6 11:40
// */
//@Api(tags = "系统管理-用户角色管理")
//@RestController
//@RequestMapping("/userRole")
//public class SysUserRoleController {
//
//
//    /** 用户角色操作 */
//    @Autowired
//    private UserRoleFeign userRoleFeign;
//
//
//    /**
//     * 根据用户角色名查询用户角色
//     *
//     * @param pageBean 参数
//     * @return CommonRespData<PageInfo < SysUserRole>>
//     * @author: 刘飞华
//     * @date: 2019/5/6 9:12
//     */
//    @PostMapping("/list")
//    public CommonRespData<PageInfoVo<SysUserRole>> list(@RequestBody PageBean pageBean) {
//        return CommonRespData.success(userRoleFeign.list(pageBean);
//    }
//
//    /**
//     * 添加用户角色
//     *
//     * @param userRole 参数
//     * @return CommonRespData<PageInfo < SysUserRole>>
//     * @author: 刘飞华
//     * @date: 2019/5/6 9:12
//     */
//    @PostMapping("/add")
//    public CommonRespData<Integer> add(@RequestBody SysUserRole userRole) {
//        return CommonRespData.success(userRoleFeign.add(userRole);
//    }
//
//    /**
//     * 删除用户角色
//     *
//     * @param id 主键
//     * @return CommonRespData<Integer>
//     * @author: 刘飞华
//     * @date: 2019/5/6 9:12
//     */
//    @DeleteMapping("/delete/{id}")
//    public CommonRespData<Integer> deleteById(@PathVariable("id") Integer id) {
//        return CommonRespData.success(userRoleFeign.deleteById(id);
//    }
//
//    /**
//     * 更新用户角色
//     *
//     * @param userRole 参数
//     * @return CommonRespData<Integer>
//     * @author: 刘飞华
//     * @date: 2019/5/6 9:12
//     */
//    @PutMapping("/update")
//    public CommonRespData<Integer> updateById(@RequestBody SysUserRole userRole) {
//        return CommonRespData.success(userRoleFeign.updateById(userRole);
//    }
//
//    /**
//     * 根据id查询用户角色
//     *
//     * @param id 主键
//     * @return CommonRespData<SysUserRole>
//     * @author: 刘飞华
//     * @date: 2019/5/6 9:14
//     */
//    @GetMapping("/find/{id}")
//    public CommonRespData<SysUserRole> find(@PathVariable("id") Integer id) {
//        return CommonRespData.success(userRoleFeign.findById(id);
//    }
//}