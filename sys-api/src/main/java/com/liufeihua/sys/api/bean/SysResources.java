package com.liufeihua.sys.api.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import com.liufeihua.sys.common.page.PageBean;

/**
 * 资源信息
 */
@Data
public class SysResources extends PageBean implements Serializable {
	private Integer id;

	/*资源名*/
	private String name;

	/*资源路径*/
	private String url;

	/*权限*/
	private String permission;

	/*父id*/
	private Integer pid;

	/*创建时间*/
	private Date createTime;

	/*创建者*/
	private Integer createBy;

	/*更新时间*/
	private Date updateTime;

	/*更新者*/
	private Integer updateBy;

	/*备注*/
	private String remarks;

	private static final long serialVersionUID = 1L;

}