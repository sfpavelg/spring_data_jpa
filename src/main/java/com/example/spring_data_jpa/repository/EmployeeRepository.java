package com.example.spring_data_jpa.dao;

import com.example.spring_cours_springboot.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);

}
