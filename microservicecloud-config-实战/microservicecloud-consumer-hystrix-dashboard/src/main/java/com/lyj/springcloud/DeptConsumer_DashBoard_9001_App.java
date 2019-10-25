package com.lyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
/**
 * 开启服务监控功能
 * 
 * @author 96971
 *
 */
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_9001_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer_DashBoard_9001_App.class, args);
    }
}
