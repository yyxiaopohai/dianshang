package com.atguigu.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class ProviderController {

    @Value("${myName}")
    private String myName;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${redis.name}")
    private String redisName;
    /*@Value("${myClass}")
    private String myClass;*/
    @GetMapping("hi")
    public String hi(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL().toString());
        return "provider---hi"+myName+", jdbcUrl"+jdbcUrl+",redisName"+redisName;
    }
}
