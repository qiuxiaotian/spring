package com.allsheng.spring5.bean;

import org.springframework.stereotype.Component;

/**
 * @author chenht
 * @date 2022/8/13
 */
@Component
public class MyBean {

    public void testAnnotation() {
        System.out.println("Component 注解生效了");
    }
}
