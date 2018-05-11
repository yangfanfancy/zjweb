package com.vkeline.zjweb;

import java.util.Date;

import io.swagger.annotations.*;
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

    /**
     * @param
     * @return
     * @Description: 显示主页
     * @author YANG
     * @date 2018/5/11
     * @exception/throws
     */
    @ApiOperation(value = "主页", notes = "返回主页")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping("/name")
    public String index() {
        return "这是主页";
    }

    /**
     * @param []
     * @return java.lang.String
     * @Description:显示当前时间
     * @author YANG
     * @date 2018/5/11
     * @exception/throws
     */
    @SuppressWarnings("deprecation")
    @RequestMapping("/date")
    String nowDate() {
        return "现在的时间是：" + (new Date()).toString();
    }

    /**
     * @param [name, height, address]
     * @return java.lang.String
     * @Description:一个测试的API
     * @author YANG
     * @date 2018/5/11
     * @exception/throws
     */
    @GetMapping("/person/{name}/{height}/{address}")
    public String getInfo(@PathVariable String name, @PathVariable Double height, @PathVariable String address) {
        return "姓名：" + name + "，身高：" + height + ",家庭住址：" + address;
    }

    /**
     * @param [name, height, address]
     * @return java.lang.String
     * @Description:一个测试的API
     * @author YANG
     * @date 2018/5/11
     * @exception/throws
     */
    @GetMapping("/person/{name}-{height}-{address}")
    public String getInfo02(@PathVariable String name, @PathVariable Double height, @PathVariable String address) {
        return "姓名：" + name + "，身高：" + height + ",家庭住址：" + address;
    }

    /**
     * @param
     * @return
     * @Description: main函数，运行这个class
     * @author YANG
     * @date 2018/5/11
     * @exception/throws
     */
    public static void main(String[] args) {
        SpringApplication.run(TestAPI.class, args);
    }

}
