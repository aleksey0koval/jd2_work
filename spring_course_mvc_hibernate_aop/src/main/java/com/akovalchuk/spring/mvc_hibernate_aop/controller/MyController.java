package com.akovalchuk.spring.mvc_hibernate_aop.controller;

import com.akovalchuk.spring.mvc_hibernate_aop.entity.Employee;
import com.akovalchuk.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    private EmployeeService employeeService;

    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String showAllEmployees(Model model) {
        model.addAttribute("allEmps", employeeService.getAllEmployees());
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id,
                                 Model model
    ) {
        model.addAttribute("employee", employeeService.getEmployee(id));
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {

        employeeService.deleteEmployee(id);


        return "redirect:/";
    }

}
