package com.kgc.swaggerconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//在注册中心注册为服务
@EnableEurekaClient
//允许使用swagger2
@EnableSwagger2
public class SwaggerConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SwaggerConsumerApplication.class, args);
    }

}
