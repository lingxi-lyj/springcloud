package com.lyj.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {
    /**
     * @LoadBalanced//开启负载均衡 springcloud ribbon是基于Netflix Ribbon实现的一套客户端， 负载均衡的工具
     * 
     * @return
     */
    @Bean
    @LoadBalanced // 开启负载均衡
    public RestTemplate geRestTemplate() {
        return new RestTemplate();
    }

    /**
     * Ribbon有七种算法，如果要切换算法， 只需要在这边new一个算法就行了
     * 
     * @return
     */
    @Bean
    public IRule myRule() {
        /**
         * 达到目的，用我们重新选择的随机算法替代默认的轮询算法。并添加到容器里
         */
//        return new RandomRule();// 随机算法
//        return new RoundRobinRule();//轮询算法
        /**
         * 先按照RoundRobinRule的策略获取， 如果获取服务失败则在指定时间内会再次进行尝试，获取可用服务， 如果多次访问一个宕机的服务提供者的实例，它会在多次尝试连接以后
         * 如果还是不成功，会自动放弃后面负载均衡的时候访问这个这个服务实例。
         */
        return new RetryRule();
    }

}
// boot--spring applicationContext.xml
//--@Configuration配置 ConfigBean=applicationContext.xml
//public UserService getUserService() {
//  return new UserServiceImpl();
//}
/**
 * applicationContext.xml==ConfigBean(@Configuration) <bean id="userService" class="com.lyj.tmall.UserServiceImpl">
 * 这里的id相当于上面的方法类型UserService，class就相当于return的返回值，
 */
