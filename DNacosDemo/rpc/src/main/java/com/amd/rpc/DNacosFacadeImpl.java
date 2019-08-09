package com.amd.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import com.amd.facade.DNacosFacade;
import com.amd.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;


@Service(version = "${amd.service.version}")
public class DNacosFacadeImpl implements DNacosFacade {

    @Autowired
    private DemoService demoService;

    @Override
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
