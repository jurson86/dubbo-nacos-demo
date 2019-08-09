package com.amd.controller;


import com.amd.mybatis.entity.User;
import com.amd.mybatis.service.UserService;
import com.amd.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoConsumerController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DemoService demoService;

    @Autowired
    private UserService userService;

    @RequestMapping("/sayHello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable("name") String name) {

        // 查询
        List<String> aa = userService.queryAllPerms(1L);
        logger.info("user query: " + aa.toString());

        // 插入
        User user = new User();
        logger.info("user save: " + userService.save(user));

        //更新
        userService.updatePassword(2L,"22222222");

        return demoService.sayHello(name);
    }

}
