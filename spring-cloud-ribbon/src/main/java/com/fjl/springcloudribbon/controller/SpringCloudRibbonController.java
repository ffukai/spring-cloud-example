package com.fjl.springcloudribbon.controller;

import com.fjl.springcloudribbon.service.SpringCloudRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudRibbonController {

    @Autowired
    private SpringCloudRibbonService springCloudRibbonService;

    @RequestMapping("getUser")
    public String getUser(){
        return springCloudRibbonService.getUser();
    }
}
