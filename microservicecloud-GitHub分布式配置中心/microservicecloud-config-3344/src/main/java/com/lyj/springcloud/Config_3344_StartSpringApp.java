package com.lyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 开启分布式Config功能。
public class Config_3344_StartSpringApp {

    public static void main(String[] args) {

        SpringApplication.run(Config_3344_StartSpringApp.class, args);
    }
}
