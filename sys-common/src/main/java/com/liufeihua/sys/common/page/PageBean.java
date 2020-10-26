package com.liufeihua.sys.common.page;

import java.io.Serializable;

import lombok.Data;

/**
 * 描述:
 * 作者: 刘飞华
 * 日期: 2019/4/26 17:57
 */
@Data
public class PageBean implements Serializable {

	/*每页条数*/
	private int pageSize = 10;

	/*第几页*/
	private int pageNum = 1;
}