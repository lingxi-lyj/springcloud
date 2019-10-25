package com.lyj.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate geRestTemplate() {
        return new RestTemplate();
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
