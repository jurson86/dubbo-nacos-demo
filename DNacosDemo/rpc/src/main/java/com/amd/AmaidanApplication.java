package com.amd;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableDubbo
@EnableConfigurationProperties
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class AmaidanApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmaidanApplication.class, args);
    }

}
