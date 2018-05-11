package com.vkeline.zjweb;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xzw")
@EnableAutoConfiguration
public class TestAPI {
    @RequestMapping("/name")
    public String index() {
        return "I am xzw";
    }

    @SuppressWarnings("deprecation")
    @RequestMapping("/date")
    String nowDate() {
        return "现在的时间是：" + (new Date()).toString();
    }

    @GetMapping("/person/{name}/{height}/{address}")
    public String getInfo(@PathVariable String name, @PathVariable Double height, @PathVariable String address) {
        return "姓名：" + name + "，身高：" + height + ",家庭住址：" + address;
    }

    @GetMapping("/person/{name}-{height}-{address}")
    public String getInfo02(@PathVariable String name, @PathVariable Double height, @PathVariable String address) {
        return "姓名：" + name + "，身高：" + height + ",家庭住址：" + address;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestAPI.class, args);
    }

}
