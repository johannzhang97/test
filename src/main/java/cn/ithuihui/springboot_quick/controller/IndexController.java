package cn.ithuihui.springboot_quick.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: JohannZhang
 * @Email: JohannZhang97@gmail.com
 * @Date: 2020年05月01日 13:56
 * @Description: 测试控制类
 */
@RestController
public class IndexController {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;


    @GetMapping("/index")
    public String index() {
        return "Hello SpringBoot访问成功! name=" + name + ",age=" + age;
    }
}
