/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.sleuth.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descroption:
 * @author: huangxiaolong02 （404386575@qq.com）
 * @date: 2019/2/13
 */
@RestController
@RequestMapping("/test/")
public class DemoController {
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public @ResponseBody
    String demo() {
        throw new RuntimeException("test runtime excpetion");
        // return "demo string";
    }
}

