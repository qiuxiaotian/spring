package com.allsheng.spring5.beans;

import java.util.Map;
import java.util.Objects;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class MapBean {

    private Map<String, Stu> stuMap;

    @Override
    public String toString() {
        return "MapBean{" +
                "stuMap=" + stuMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapBean mapBean = (MapBean) o;
        return Objects.equals(stuMap, mapBean.stuMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuMap);
    }

    public Map<String, Stu> getStuMap() {
        return stuMap;
    }

    public void setStuMap(Map<String, Stu> stuMap) {
        this.stuMap = stuMap;
    }

    public MapBean() {
    }

    public MapBean(Map<String, Stu> stuMap) {
        this.stuMap = stuMap;
    }
}
