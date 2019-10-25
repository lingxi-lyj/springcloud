package com.lyj.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lyj.springcloud.entities.Dept;

@Mapper // 添加mybatis注解（mapper文件）
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List < Dept > findAll();
}
