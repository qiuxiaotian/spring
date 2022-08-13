package com.allsheng.spring5.test;

import com.allsheng.spring5.beans.Dept;
import com.allsheng.spring5.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class IocTest1 {

    @Test
    public void test1() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        Dept dept = context.getBean("dept", Dept.class);
        dept.add();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        DeptService deptService = context.getBean("deptService", DeptService.class);
        deptService.addService();
    }

    // bean的自动装配
    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        // 根据属性名自动注入
        Dept dept1 = context.getBean("dept1", Dept.class);
        // 根据属性类型自动注入
        Dept dept3 = context.getBean("dept3", Dept.class);
        System.out.println(dept1);
        System.out.println(dept3);
    }
}
