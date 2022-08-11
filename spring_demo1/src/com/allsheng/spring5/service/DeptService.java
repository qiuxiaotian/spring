package com.allsheng.spring5.service;

import com.allsheng.spring5.dao.DeptDao;

/**
 * @author Administrator
 * @date 2022/8/11
 */
public class DeptService {

    private DeptDao deptDao;

    public void addService() {
        deptDao.addDao();
        System.out.println("addService()....");
    }

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }
}
