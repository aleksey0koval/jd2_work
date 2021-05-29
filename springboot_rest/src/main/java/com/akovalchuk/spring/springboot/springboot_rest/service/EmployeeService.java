package com.akovalchuk.spring.springboot.springboot_rest.service;


import com.akovalchuk.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
