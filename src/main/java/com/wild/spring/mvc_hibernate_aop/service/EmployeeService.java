package com.wild.spring.mvc_hibernate_aop.service;

import com.wild.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
}
