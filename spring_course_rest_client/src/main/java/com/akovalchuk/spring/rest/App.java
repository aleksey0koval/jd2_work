package com.akovalchuk.spring.rest;

import com.akovalchuk.spring.rest.configuration.MyConfig;
import com.akovalchuk.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean(Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//
//        System.out.println(allEmployees);
//        allEmployees.forEach(System.out::println);
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(15);
//        communication.saveEmployee(emp);
        communication.deleteEmployee(15);
    }
}
