package com.allsheng.spring5.beans;

import java.util.Arrays;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class ArrayBean {

    private Stu[] stus;

    @Override
    public String toString() {
        return "ArrayBean{" +
                "stus=" + Arrays.toString(stus) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayBean arrayBean = (ArrayBean) o;
        return Arrays.equals(stus, arrayBean.stus);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(stus);
    }

    public Stu[] getStus() {
        return stus;
    }

    public void setStus(Stu[] stus) {
        this.stus = stus;
    }

    public ArrayBean() {
    }

    public ArrayBean(Stu[] stus) {
        this.stus = stus;
    }
}
