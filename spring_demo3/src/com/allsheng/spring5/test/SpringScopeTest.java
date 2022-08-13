package com.allsheng.spring5.test;

import com.allsheng.spring5.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenht
 * @date 2022/8/13
 */
public class SpringScopeTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    @Test
    public void test1() {

        // 单例，创建的是同一个对象
        Book book1 = context.getBean("book1", Book.class);
        Book book2 = context.getBean("book1", Book.class);

        // 多例，创建多个对象
        Book book3 = context.getBean("book2", Book.class);
        Book book4 = context.getBean("book2", Book.class);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("-------------------");

        System.out.println(book3);
        System.out.println(book4);
    }
}
