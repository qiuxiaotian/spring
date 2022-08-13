package com.allsheng.spring5.test;

import com.allsheng.spring5.bean.Order;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenht
 * @date 2022/8/13
 */

/**
 * bean的生命周期
 * 1.通过构造器创建对象
 * 2.为bean的属性设置值和对其他bean引用(set方法)
 * 3.后置处理器在初始化方法前执行()
 * 4.调用初始化方法对bean初始化(需要配置初始化的方法)
 * 5.后置处理器在初始化方法后执行()
 * 6.获取对象
 * 7.spring容器关闭时，调用bean的销毁方法(需要配置销毁的方法)
 */
public class InitMethodTest {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

    @Test
    public void test1() {
        Order order1 = context.getBean("order", Order.class);
        Order order2 = context.getBean("order", Order.class);
        System.out.println("第四步：获取Order对象" + order1);
        System.out.println("第四步：获取Order对象" + order2);

        context.close();
    }
}
