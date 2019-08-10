package com.amd.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.amd.facade.DNacosFacade;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "${amd.service.version}")
    private DNacosFacade dnacosFacade;

    @RequestMapping(value = "/hi/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return dnacosFacade.sayHello(name);
    }
}
