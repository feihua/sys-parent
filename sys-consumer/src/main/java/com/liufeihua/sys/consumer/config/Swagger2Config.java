package com.liufeihua.sys.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 描述: 
 * 作者: 刘飞华
 * 日期: 2020/10/28 9:19
 */
@Configuration
public class Swagger2Config {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.liufeihua.sys.consumer.controller"))
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("SwaggerUI演示").description("后台api")
				.contact(new Contact("liufeihua", null, "1002219331@qq.com")).version("1.0").build();
	}
}