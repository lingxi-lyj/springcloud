package com.lyj.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {

    /**
     * @Value :从自己配置文件里读取信息并赋值给这里的变量。
     */
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    private String getConfig() {
        String str = "applicationName:    " + applicationName + "\t eurekaServers:    " + eurekaServers
                + "\t port:     " + port;
        System.out.println("******str:" + str);
        return "applicationName:    " + applicationName + "\t eurekaServers:    " + eurekaServers + "\t port:    "
                + port;

    }
}
