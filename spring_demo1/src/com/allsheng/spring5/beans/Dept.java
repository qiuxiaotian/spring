package com.allsheng.spring5.beans;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class Dept {

    private String dname;
    private int dno;
    private Emp emp;

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                ", dno=" + dno +
                ", emp=" + emp +
                '}';
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public void add() {
        System.out.println(this.toString());
    }
}
