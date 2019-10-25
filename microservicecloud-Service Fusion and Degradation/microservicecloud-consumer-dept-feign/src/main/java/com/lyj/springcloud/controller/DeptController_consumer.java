package com.lyj.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lyj.springcloud.entities.Dept;
import com.lyj.springcloud.service.DeptClientService;

@RestController
public class DeptController_consumer {

    /**
     * 注入公共模块api工程里的DeptClientService接口；
     */
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept) {
        return this.service.add(dept);

    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List < Dept > list(Dept dept) {
        return this.service.list();
    }

}
