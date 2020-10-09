package com.sachin.entity.service;

import com.sachin.entity.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/refactor")//注意这里的服务名不区分大小写，hello-service和HELLO-SERViCE都可以
public interface HelloService {

    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/helllo5",method = RequestMethod.GET)
    User hello(@RequestHeader(name = "name") String name,@RequestHeader(name = "age")Integer age);


    @RequestMapping(value = "/hello6",method=RequestMethod.POST)
    String hello(@RequestBody User user);

}
