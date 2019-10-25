package com.lyj.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lyj.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component // 重点！！不能忘记在这里把它设置为组件。
public class DeptClientServiceFallbackFactory implements FallbackFactory < DeptClientService > {

    @Override
    public DeptClientService create(Throwable cause) {
        // TODO Auto-generated method stub
        return new DeptClientService() {

            @Override
            public Dept get(Long id) {
                // TODO Auto-generated method stub
                return new Dept().setDeptno(id).setDname("该ID" + id + "没有对应的信息，Consumer客端提供的服务降级信息，此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");

            }

            // 以下两个方法没有实现，这里只是测试
            @Override
            public boolean add(Dept dept) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public List < Dept > list() {
                // TODO Auto-generated method stub
                return null;
            }

        };
    }

}
