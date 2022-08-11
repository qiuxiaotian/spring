package com.allsheng.spring5.test;

import com.allsheng.spring5.beans.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class CollectionTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    // 数组
    @Test
    public void test1() {
        ArrayBean arrayStu = context.getBean("arrayStu", ArrayBean.class);
        Stu[] stus = arrayStu.getStus();
        for (Stu stu : stus) {
            System.out.println("name=" + stu.getName());
            System.out.println("no" + stu.getNo());
            System.out.println("------------------------");
        }
    }

    // List集合
    @Test
    public void test2() {
        ListBean listStu = context.getBean("listStu", ListBean.class);
        List<Stu> stuList = listStu.getStuList();
        for (Stu stu : stuList) {
            System.out.println("name=" + stu.getName());
            System.out.println("no" + stu.getNo());
            System.out.println("------------------------");
        }
    }

    // Map集合
    @Test
    public void test3() {
        MapBean mapStu = context.getBean("mapStu", MapBean.class);
        Map<String, Stu> stuMap = mapStu.getStuMap();
        Set<String> set = stuMap.keySet();
        for (String s : set) {
            System.out.println("key = " + s);
            System.out.println("value-name = " + stuMap.get(s).getName());
            System.out.println("value-no = " + stuMap.get(s).getNo());
            System.out.println("----------");
        }
    }

    // Set集合
    @Test
    public void test4() {
        SetBean setStu = context.getBean("setStu", SetBean.class);
        Set<Stu> stuSet = setStu.getStuSet();
        for (Stu stu : stuSet) {
            System.out.println("name=" + stu.getName());
            System.out.println("no" + stu.getNo());
            System.out.println("------------------------");
        }

    }
}
