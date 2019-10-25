package com.lyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient // 开启Eureka的客户端功能
/**
 * @EnableFeignClients(basePackages= {"com.lyj.springcloud"}) 开启Feign功能， 调用api工程里的带有@FeignClient注解的service接口
 * 这里的basePackages指定添加@FeignClient所在工程包。即api工程包名
 * 
 * @author 96971 @ComponentScan("com.lyj.springcloud") 这个是扫描本工程下的工程包名。
 */
@EnableFeignClients(basePackages = { "com.lyj.springcloud" })
@ComponentScan("com.lyj.springcloud")
public class DeptConsumer80__feign_App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SpringApplication.run(DeptConsumer80__feign_App.class, args);
    }

}
