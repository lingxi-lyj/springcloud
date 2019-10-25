package com.lyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient // 开启服务发现功能，控制器里的服务发现方法能正常运行。
@EnableEurekaClient // 本服务启动后会自动将服务注册进Eureka服务中心中
@SpringBootApplication
@EnableCircuitBreaker // 开启Hystrix功能支持，即开启对Hystrix熔断机制的支持
public class DeptProvider8001_Hystrix_App {

    /**
     * 使用服务发现功能步骤： 1、先要启动EurekaServer 2、再启动DeptProvider8001_App主启动类，需要 稍等一会 3、访问http://localhost:8001/dept/discovery
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);

    }

}
