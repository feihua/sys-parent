package com.liufeihua.sys.common.request;

import java.io.Serializable;

import lombok.Data;

/**
 * 描述：公共请求参数
 * 作者：刘飞华
 * 日期：2019/4/1 16:02
 *
 * @param <T> t
 */
@Data
public class CommonReqData<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 商户id */
	private String merchantId;

	/** 商户key */
	private String merchantKey;

	/** 请求IP */
	private String ip;

	/** 请求参数 */
	private T data;
}
