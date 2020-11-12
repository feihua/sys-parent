package com.liufeihua.sys.common.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElementTreeTableVo implements Serializable {

	private int id;
	private String name;
	private Integer createBy;
	private Date createTime;
	private String remarks;


	private List<ElementTreeTableVo> children;
}
