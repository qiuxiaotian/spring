package com.allsheng.spring5.beans;

import java.util.Objects;
import java.util.Set;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class SetBean {

    private Set<Stu> stuSet;

    public SetBean() {
    }

    public SetBean(Set<Stu> stuSet) {
        this.stuSet = stuSet;
    }

    @Override
    public String toString() {
        return "SetBean{" +
                "stuSet=" + stuSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetBean setBean = (SetBean) o;
        return Objects.equals(stuSet, setBean.stuSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuSet);
    }

    public Set<Stu> getStuSet() {
        return stuSet;
    }

    public void setStuSet(Set<Stu> stuSet) {
        this.stuSet = stuSet;
    }
}
