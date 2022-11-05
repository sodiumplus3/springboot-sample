package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class DemoController {
    @Autowired
    DiTest diTest;

    @GetMapping(path = "/test", produces = "application/json;charset=UTF-8")
    public String get(@RequestParam(name = "query", required = false) String query) {
        diTest.sayTagyou();
        System.out.println(query);
        return "リクエストquery：" + query;
    }
}
