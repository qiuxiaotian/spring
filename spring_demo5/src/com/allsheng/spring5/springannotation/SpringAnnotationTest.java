package com.allsheng.spring5.springannotation;

import com.allsheng.spring5.bean.MyBean;
import com.allsheng.spring5.config.SpringConfig;
import com.allsheng.spring5.controller.A;
import com.allsheng.spring5.controller.UserController;
import com.allsheng.spring5.dao.B;
import com.allsheng.spring5.service.C;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenht
 * @date 2022/8/13
 */

public class SpringAnnotationTest {


    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        MyBean myBean = context.getBean("myBean", MyBean.class);
        myBean.testAnnotation();
        A a = context.getBean("a", A.class);
        a.testAnnotation();
        B b = context.getBean("b", B.class);
        b.testAnnotation();
        C c = context.getBean("c", C.class);
        c.testAnnotation();

    }

    @Test
    public void test2() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.userAdd();
    }

    @Test
    public void test3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("userController", UserController.class);
        userController.userAdd();
    }

}
