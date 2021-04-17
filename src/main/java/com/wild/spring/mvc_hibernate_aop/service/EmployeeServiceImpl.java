package com.wild.spring.mvc_hibernate_aop.service;

import com.wild.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.wild.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional // spring сам будет контролировать открытие/закрытие транзакций
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
