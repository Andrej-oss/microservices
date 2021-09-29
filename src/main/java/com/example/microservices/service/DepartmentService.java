package com.example.microservices.service;


import com.example.microservices.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department getDepartment(long id);
    List<Department> getAllDepartments();
    Department saveDepartment(Department department);
    boolean upDateDepartment(long id, Department department);
    boolean deleteDepartment(long id);

}
