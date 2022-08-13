package com.allsheng.spring5.bean;

/**
 * @author chenht
 * @date 2022/8/13
 */
public class Order {

    private String name;

    public Order() {
        System.out.println("第一步：调用无参构造创建对象");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步：调用set方法设置属性值");
    }

    public void initMethod() {
        System.out.println("第三步：执行初始化方法");
    }

    public void destroyMethod() {
        System.out.println("第五步：执行销毁方法");
    }
}
