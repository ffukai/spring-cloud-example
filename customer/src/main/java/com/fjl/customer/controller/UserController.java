package com.fjl.customer.controller;


import com.fjl.customer.model.MyResult;
import com.fjl.customer.model.User;
import com.fjl.customer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/customer")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public MyResult getUser(User user){
        return userService.getUser(user);
    }

}
