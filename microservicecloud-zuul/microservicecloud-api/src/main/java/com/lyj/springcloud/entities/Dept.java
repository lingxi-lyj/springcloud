package com.lyj.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial") // 如果有类上或者方法上或者参数上有警告。添加此注解可以选择压制
//@AllArgsConstructor // 添加传参构造函数的注解，依赖于lombok（俗称小辣椒）的依赖
@NoArgsConstructor // 添加构造空构造函数的注解
@Data // 添加使每个参数都生成getter和setter方法
@Accessors(chain = true) // 添加链式风格访问的注解
public class Dept implements Serializable// Dept(Entity) ORM mysql->Dept(table) 类关系映射
{ // 必须序列化

    private Long deptno;// 主键

    private String dname;// 部门名称

    /**
     * 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库， 同一个信息被存在不同的数据库
     */

    private String db_source;

//	检测是否能够自定义构造函数
//	public Dept(String dname) {
//		super();
//		this.dname = dname;
//	}
//	
//	//检测链式风格访问是否起作用
//	public static void main(String[] args) {
//		Dept dept=new Dept();
////		这里下面是检测
//		dept.setDeptno(11l).setDname("RD").setDb_source("DB01");
//	}

}
