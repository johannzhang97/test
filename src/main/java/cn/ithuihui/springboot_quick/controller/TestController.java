package cn.ithuihui.springboot_quick.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: JohannZhang
 * @Email: JohannZhang97@gmail.com
 * @Date: 2020年05月02日 14:10
 * @Description: TODO
 */

@Controller
@ConfigurationProperties(prefix = "person")
public class TestController {

    private String name;
    private Integer age;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "springboot 访问成功! name=" + name + ",age=" + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
