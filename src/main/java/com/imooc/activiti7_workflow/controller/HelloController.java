package com.imooc.activiti7_workflow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baj
 * @creat 2022-07-23 15:37
 */
@RestController
public class HelloController {
    //如下是路径
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "Activiti7 欢迎你";
    }
}
