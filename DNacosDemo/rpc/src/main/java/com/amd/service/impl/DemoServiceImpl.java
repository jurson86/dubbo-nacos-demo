package com.amd.service.impl;

import com.amd.service.DemoService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
@AllArgsConstructor
public class DemoServiceImpl  implements DemoService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    private final RedisTemplate redisTemplate;

    @Override
    public String sayHello(String name) {
        logger.info("starting ....");

        //redis option 60秒
        redisTemplate.opsForValue().set("DNacosDemo-key","hello world!",60, TimeUnit.SECONDS);
        String hwold = (String) redisTemplate.opsForValue().get("DNacosDemo-key");
        logger.info("redis opt: " + hwold);

        return "Hello, " + name + " (from Spring Boot)";
    }
}
