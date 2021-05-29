package com.akovalchuk.spring.springboot.springboot_rest.controller;

import com.akovalchuk.spring.springboot.springboot_rest.entity.Employee;
import com.akovalchuk.spring.springboot.springboot_rest.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    private EmployeeService employeeService;

    public MyRESTController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        Employee employee = employeeService.getEmployee(id);

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted!";
    }


}
