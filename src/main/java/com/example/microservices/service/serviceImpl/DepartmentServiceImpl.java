package com.example.microservices.service.serviceImpl;

import com.example.microservices.dao.DepartmentDao;
import com.example.microservices.entity.Department;
import com.example.microservices.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentDao departmentDao;

    @Autowired
    public DepartmentServiceImpl(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public Department getDepartment(long id) {
        return departmentDao.findById(id).get();
    }

    @Override
    public List<Department> getAllDepartments() {
        return null;
    }

    @Override
    public Department saveDepartment(Department department) {
        departmentDao.save(department);
        return department;
    }

    @Override
    public boolean upDateDepartment(long id, Department department) {
        return false;
    }

    @Override
    public boolean deleteDepartment(long id) {
        return false;
    }
}
