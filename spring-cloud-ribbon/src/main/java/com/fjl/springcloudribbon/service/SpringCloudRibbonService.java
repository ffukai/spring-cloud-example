package com.fjl.springcloudribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpringCloudRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String getUser(){
        String message;
        try {
            System.out.println("调用 服务 EUREKA-CLIENT/info");
            message = restTemplate.getForObject("http://customer/customer/getUser?id=1",String.class);
            System.out.println("服务 EUREKA-CLIENT/info 返回信息 : " + message);
            System.out.println("调用 服务 EUREKA-CLIENT/info 成功！");
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message ;
    }
}
