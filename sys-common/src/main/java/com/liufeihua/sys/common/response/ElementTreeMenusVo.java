package com.liufeihua.sys.common.response;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElementTreeMenusVo implements Serializable {

	private int id;

	private int parentId;

	private String createTime;

	private String title;

	private int level;

	private int sort;

	private String name;

	private String icon;

	private int hidden;

	private String path;

	private String component;

	private int type;

	private int status;

	private List<ElementTreeMenusVo> children;

}
