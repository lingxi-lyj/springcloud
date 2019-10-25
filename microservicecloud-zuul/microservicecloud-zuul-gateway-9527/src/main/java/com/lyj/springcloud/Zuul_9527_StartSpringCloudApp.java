package com.lyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }) 由于没有配置数据源，所以这里自动配置时要排除数据源的自动配置，要不然报错
 * @author 96971
 *
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
//@SpringBootApplication
@EnableZuulProxy // 开启Zuul功能
public class Zuul_9527_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
    }
}
