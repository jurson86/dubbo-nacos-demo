package com.amd;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableDubbo
@EnableConfigurationProperties
@SpringBootApplication
public class AmaidanApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmaidanApplication.class, args);
    }

}
