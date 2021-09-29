package com.example.microservices.controller;

import com.example.microservices.entity.Department;
import com.example.microservices.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        log.info("Handling save department with body " + department);
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable long id){
        log.info("Handling getting department by id = " + id);
        return departmentService.getDepartment(id);
    }
}
