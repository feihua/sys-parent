package com.liufeihua.sys.api.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

import com.liufeihua.sys.common.page.PageBean;

/*角色信息*/
@Data
public class SysRole extends PageBean implements Serializable {
	private Integer id;

	/*角色名*/
	private String name;

	private Date createTime;

	private Integer createBy;

	private Date updateTime;

	private Integer updateBy;

	private String remarks;

	private static final long serialVersionUID = 1L;

}