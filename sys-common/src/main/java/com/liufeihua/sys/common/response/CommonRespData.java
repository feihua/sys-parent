package com.liufeihua.sys.common.response;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * 描述：统一返回处理
 * <p>
 * 作者：刘飞华
 * 日期：2019/1/10 9:57
 *
 * @param <T> t
 */
@Data
@Builder
public class CommonRespData<T> implements Serializable {

	/** 返回code */
	private String code;

	/** 返回消息 */
	private String message;

	/** 返回数据 */
	private T data;

	/**
	 * 请求成功
	 *
	 * @param <T>  t
	 * @param data d
	 * @return CommonRespData r
	 * @author: 刘飞华
	 * @date: 2019/4/19 10:51
	 */
	public static <T> CommonRespData<T> success(T data) {
		return CommonRespData.<T>builder().code("000000").message("请求成功").data(data).build();

	}

	/**
	 * 异常
	 *
	 * @param code    c
	 * @param message m
	 * @param <T>     t
	 * @return CommonRespData r
	 * @author: 刘飞华
	 * @date: 2019/4/19 10:51
	 */
	public static <T> CommonRespData<T> error(String code, String message) {
		return CommonRespData.<T>builder().code(code).message(message).build();

	}
}
