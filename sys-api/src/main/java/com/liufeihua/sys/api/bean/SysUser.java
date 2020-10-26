package com.liufeihua.sys.api.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import com.liufeihua.sys.common.page.PageBean;

@Data
public class SysUser extends PageBean implements Serializable {
	private Integer id;

	private String name;

	private String password;

	private Integer age;

	private String phone;

	private String email;

	private Date createTime;

	private Integer createBy;

	private Date updateTime;

	private Integer updateBy;

	private String remarks;

	private static final long serialVersionUID = 1L;

}