package com.fjl.springcloudfeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "customer")
public interface SpringCloudFeignService {

    @RequestMapping(value = "/customer/getUser")
    String getUser(@RequestParam String id);
}
