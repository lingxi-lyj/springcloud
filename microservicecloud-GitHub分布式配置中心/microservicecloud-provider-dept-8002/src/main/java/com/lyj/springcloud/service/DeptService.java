package com.lyj.springcloud.service;

import java.util.List;

import com.lyj.springcloud.entities.Dept;

public interface DeptService {

    /**
     * 这里是对数据库访问的函数，比较靠近底层，为了比较符合rest的风格， 这里的函数名都是以靠近底层的命名方式命名
     * 
     * @param dept
     * @return
     */
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List < Dept > list();
}
