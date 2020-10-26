package com.liufeihua.sys.api.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SysRoleResources implements Serializable {
	private Integer id;

	private Integer roleId;

	private Integer resourcesId;

	private Date createTime;

	private Integer createBy;

	private Date updateTime;

	private Integer updateBy;

	private String remarks;

	private static final long serialVersionUID = 1L;

}