package com.fjl.springcloudhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringCloudHytrixController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{id}")
    @HystrixCommand(fallbackMethod = "fallback")
    public String getUser(@PathVariable String id){
        System.out.println(id);
        String message =  restTemplate.getForObject("http://customer/customer/getUser?id=" + id,String.class) ;
        return message;
    }


    public String fallback(@PathVariable String id){
        return "error" + id;
    }
}
