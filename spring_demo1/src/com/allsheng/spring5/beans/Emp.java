package com.allsheng.spring5.beans;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class Emp {

    private String name;
    private int no;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
