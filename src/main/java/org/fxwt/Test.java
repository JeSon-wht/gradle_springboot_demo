package org.fxwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
class TestApplication{
    public static void main(String[] args){
        SpringApplication.run(TestApplication.class,args);
    }

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
