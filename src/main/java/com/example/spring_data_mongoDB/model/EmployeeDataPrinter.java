package com.example.spring_data_mongoDB.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmployeeDataPrinter {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostConstruct
    public void printEmployeeData() {
        System.out.println("Загрузка данных сотрудников...");
        List<Employee> employees = employeeRepository.findAll();
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getAge());
        }
    }
}
