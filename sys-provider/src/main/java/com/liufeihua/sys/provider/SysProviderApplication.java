package com.liufeihua.sys.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统启动类
 */
@SpringBootApplication
@MapperScan("com.liufeihua.sys.provider.dao")
public class SysProviderApplication {

	/**
	 * 启动方法
	 *
	 * @param args 参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(SysProviderApplication.class, args);
	}
}
