package com.atguigu.nocas.controller;

import com.atguigu.nocas.feign.ProviderFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    private ProviderFeign providerFeign;

    @GetMapping("hello")
    public String hello(){
        String hi = providerFeign.hi();
        return "consumer---hello"+hi;
    }
}
