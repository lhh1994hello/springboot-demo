package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lhh
 * @date 2019/1/20 13:54
 * @Description:
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world!";
    }
}
