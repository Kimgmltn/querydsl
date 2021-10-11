package study.querydsl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    
    @RequestMapping("/hello")
    public String index(){
        return "hello";
    }
}
