package com.fjl.customer.model;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer age;

}