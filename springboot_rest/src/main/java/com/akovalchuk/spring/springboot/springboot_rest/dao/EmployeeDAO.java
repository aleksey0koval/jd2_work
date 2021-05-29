package com.akovalchuk.spring.springboot.springboot_rest.dao;


import com.akovalchuk.spring.springboot.springboot_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDAO  {
    
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
