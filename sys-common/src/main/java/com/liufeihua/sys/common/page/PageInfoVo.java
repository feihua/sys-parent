package com.liufeihua.sys.common.page;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/14 11:05
 */
@Data
@AllArgsConstructor
public class PageInfoVo<T> implements Serializable {

	private List<T> list;
	private long total;

}