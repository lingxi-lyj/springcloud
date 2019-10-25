package com.lyj.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lyj.springcloud.entities.Dept;
import com.lyj.springcloud.service.DeptService;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    /**
     * 这里是引入服务发现的DiscoveryClient 注意这里的DiscoveryClient是引用这个 org.springframework.cloud.client.discovery.DiscoveryClient;
     * 还需要在application的主程序中添加@EnableDiscoveryClient注解，开启服务发现功能
     */
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {

        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {

        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List < Dept > list() {

        return service.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List < String > list = client.getServices();
        System.out.println("************" + list);

        List < ServiceInstance > srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance eInstance : srvList) {
            System.out.println(eInstance.getServiceId() + "\t" + eInstance.getHost() + "\t" + eInstance.getPort() + "\t"
                    + eInstance.getUri());
        }
        return this.client;
    }

}
