package com.akovalchuk.spring.springboot.springboot_rest.dao;

import com.akovalchuk.spring.springboot.springboot_rest.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("from Employee").getResultList();
        }

    @Override
    public void saveEmployee(Employee employee) {
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployee(int id) {

        return entityManager.find(Employee.class, id);
    }

    @Override
    public void deleteEmployee(int id) {
        Query query = entityManager.createQuery("delete FROM Employee where id = :employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
