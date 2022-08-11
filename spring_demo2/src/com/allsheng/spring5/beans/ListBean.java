package com.allsheng.spring5.beans;

import java.util.List;
import java.util.Objects;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class ListBean {

    private List<Stu> stuList;

    @Override
    public String toString() {
        return "ListBean{" +
                "stus=" + stuList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListBean listBean = (ListBean) o;
        return Objects.equals(stuList, listBean.stuList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuList);
    }

    public List<Stu> getStuList() {
        return stuList;
    }

    public void setStuList(List<Stu> stuList) {
        this.stuList = stuList;
    }

    public ListBean() {
    }

    public ListBean(List<Stu> stus) {
        this.stuList = stus;
    }
}
