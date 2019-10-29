package com.kgc.swaggerconsumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//api加载类上，对整个类进行说明
@Api("这是测试controller")
public class Testcontroller {
    @RequestMapping("index")
    //加在方法上，对方法进行说明
    @ApiOperation(value = "这是我打印等于号的路径")
    //对方法的参数进行说明
    //多参数采用ApiImplicitParams
    @ApiImplicitParams(
            @ApiImplicitParam(name = "s",value = "这就是一个普通的字符串")
    )
    public String a(String s){
        System.out.println("===========");
        return "这是一个测试swagger的controller";
    }
}