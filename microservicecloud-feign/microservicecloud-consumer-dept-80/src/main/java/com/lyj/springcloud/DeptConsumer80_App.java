package com.lyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lyj.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient // 开启Eureka的客户端功能
/**
 * @RibbonClient(name="" configuration="") 在启动该微服务的时候就能去加载我们自定义的Ribbon配置类，从而使配置类生效 name指定自定义的Ribbon算法给哪个服务使用，值为服务的名字（大写）
 * configuration指定自定义算法类名.class,这里有个细节，就是我们自定义的Ribbon算法， 不能被ComponentScan（）所扫描，自定义算法类也就是不能在主启动类所在包及其子包下，
 * 因为主启动类上标注的@SpringBootApplication里面含有@ComponentScan()这个注解 这个注解会把主启动类所在包及其子包下所有定义的标注有@Configuration注解的配置类都会被扫进来，
 * 所以不能把Ribbon算法自定义类放主启动类包及其子包下。
 * 
 * 
 *
 */
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SpringApplication.run(DeptConsumer80_App.class, args);
    }

}
