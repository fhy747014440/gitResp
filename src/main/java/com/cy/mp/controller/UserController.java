package com.cy.mp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping("/list")
    public Map list(){

        Map<Object, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",18);
        map.put("email","zhangsan@qq.com");
        return map;
    }
}
