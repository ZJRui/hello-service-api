package com.sachin.springcloud.service;

import com.sachin.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Sachin
 * @Date 2020/10/13
 **/
@RequestMapping("/refactor")
public interface HelloService {


    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader(name = "name") String name, @RequestHeader(name = "age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}

