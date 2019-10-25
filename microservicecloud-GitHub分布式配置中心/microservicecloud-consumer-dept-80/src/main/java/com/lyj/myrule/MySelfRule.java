package com.lyj.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // ribbon默认的是轮询算法，这里自定义为随机算法
//        return new RandomRule();
//        return new RoundRobinRule();// 轮询算法
        return new RandomRule_ZY(); // 自定义算法，每台服务器执行5次后再轮询到下一台，依次执行。
    }

}
