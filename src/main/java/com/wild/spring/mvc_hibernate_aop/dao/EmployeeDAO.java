package com.wild.spring.mvc_hibernate_aop.dao;

import com.wild.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
}
