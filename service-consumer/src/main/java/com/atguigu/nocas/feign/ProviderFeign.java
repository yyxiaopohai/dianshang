package com.atguigu.nocas.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-provider")
public interface ProviderFeign {
    @GetMapping("hi")
    public String hi();
}
