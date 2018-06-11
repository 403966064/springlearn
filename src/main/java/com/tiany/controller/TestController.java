package com.tiany.controller;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/firstController/", method = RequestMethod.POST)
    public @ResponseBody  String test(){
        return "success";
    }


    @RequestMapping(value = "/example/{param}")
    public HttpEntity<String> example(@PathVariable String param){
        return new HttpEntity<>(param);
    }
}
