package com.fjl.springcloudfeign.controller;

import com.fjl.springcloudfeign.service.SpringCloudFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudFeignController {

    @Autowired
    private SpringCloudFeignService feignService;

    @GetMapping(value = "/getUser/{id}")
    public String getUser(@PathVariable String id){
        System.out.println(id);
        return feignService.getUser(id);
    }
}
