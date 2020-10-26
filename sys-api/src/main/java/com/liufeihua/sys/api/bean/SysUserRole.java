package com.liufeihua.sys.api.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SysUserRole implements Serializable {
	private Integer id;

	private Integer userId;

	private Integer roleId;

	private Date createTime;

	private Integer createBy;

	private Date updateTime;

	private Integer updateBy;

	private String remarks;

	private static final long serialVersionUID = 1L;

}