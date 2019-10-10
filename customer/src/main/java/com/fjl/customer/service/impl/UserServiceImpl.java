package com.fjl.customer.service.impl;


import com.fjl.customer.dao.UserMapper;
import com.fjl.customer.model.MyResult;
import com.fjl.customer.model.User;
import com.fjl.customer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public MyResult getUser(User user) {
        User u = new User();
        List<User> userList = new ArrayList<User>();
        userList = userMapper.getUser(user);
        MyResult myResult = new MyResult();
        if (userList.size() != 0){
            myResult.setCode(0);
            myResult.setList(userList);
            myResult.setMsg("登陆成功！");
            myResult.setObject(userList.get(0));
        }else {
            myResult.setCode(1);
            myResult.setMsg("登陆失败！");

        }
        return myResult;
    }
}
