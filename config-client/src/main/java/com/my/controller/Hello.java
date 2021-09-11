package com.my.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wangluoxin
 * @date 2021/9/10
 */
@RestController
public class Hello {

    @Value("${user.name}")
    private String name;

    @GetMapping("name")
    public String m1(){
        return name;
    }
}
