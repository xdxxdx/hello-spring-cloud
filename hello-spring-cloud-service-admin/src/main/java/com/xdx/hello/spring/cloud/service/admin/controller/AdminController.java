package com.xdx.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    //注入服务器端口
    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "/hi/{message}",method = RequestMethod.GET)
    public String sayHi(@PathVariable String message){
        return String.format("Hi your message is :%s,port is %s",message,port);
    }
}
