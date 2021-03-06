package com.tiany.controller;


import com.alibaba.fastjson.JSON;
import com.tiany.entity.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public @ResponseBody String greeting(@RequestParam(value = "name", defaultValue = "world!") String name){
        return JSON.toJSONString(new Greeting(counter.incrementAndGet(), String.format(template, name)));
    }

    public static void main(String[] args) {

    }
}
