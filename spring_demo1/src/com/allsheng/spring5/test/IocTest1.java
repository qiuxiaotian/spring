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
        Dept dept = context.getBean("dept",Dept.class);
        dept.add();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        DeptService deptService = context.getBean("deptService", DeptService.class);
        deptService.addService();
    }
}
