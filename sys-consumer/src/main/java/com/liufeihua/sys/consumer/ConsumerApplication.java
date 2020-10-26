package com.liufeihua.sys.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * 系统启动类
 */
//@EnableSwagger2Doc
@SpringBootApplication
public class ConsumerApplication {

	/**
	 * 启动方法
	 *
	 * @param args 参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
