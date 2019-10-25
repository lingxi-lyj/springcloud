package com.lyj.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lyj.springcloud.entities.Dept;

/**
 * @FeignClient(value = "MICROSERVICECLOUD-DEPT") 指该接口中的方法用在哪个服务上，并且针对接口编程， 其实REST与Feign都是Client。
 * 
 * @author 96971
 *
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List < Dept > list();

}
