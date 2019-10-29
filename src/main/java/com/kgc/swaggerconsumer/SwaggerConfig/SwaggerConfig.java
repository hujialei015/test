package com.kgc.swaggerconsumer.SwaggerConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //文档标题
                .title("测试文档")
                //文档简介
                .description("测试文档，不做解释")
                //作者主页
                .termsOfServiceUrl("https://www.baidu.com")
                //版本
                .version("1.0")
                .build();
    }

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                //配置上自己创建的api
                .apiInfo(apiInfo())
                .select()
                //配置 生成位置  自己的包名
                .apis(RequestHandlerSelectors.basePackage("com.kgc"))
                //代表任何一处都扫描swagger
                .paths(PathSelectors.any())
                .build();
    }
}
