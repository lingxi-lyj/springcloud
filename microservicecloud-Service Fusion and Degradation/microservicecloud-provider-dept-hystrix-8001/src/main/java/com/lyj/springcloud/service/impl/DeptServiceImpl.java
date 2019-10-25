package com.lyj.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyj.springcloud.dao.DeptDao;
import com.lyj.springcloud.entities.Dept;
import com.lyj.springcloud.service.DeptService;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {

        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {

        return deptDao.findById(id);
    }

    @Override
    public List < Dept > list() {

        return deptDao.findAll();
    }

}
