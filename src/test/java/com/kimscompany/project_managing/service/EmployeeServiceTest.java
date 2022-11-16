package com.kimscompany.project_managing.service;

import com.kimscompany.project_managing.domain.employee.Employee;
import com.kimscompany.project_managing.domain.employee.JobGroup;
import com.kimscompany.project_managing.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void signUp() {
        Employee newEmployee = Employee.createEmployee("wee", "991117", "mju", "roongiw", "004637", JobGroup.Development);
        Employee savedEmployee = employeeRepository.save(newEmployee);
        org.assertj.core.api.Assertions.assertThat(newEmployee).isEqualTo(savedEmployee);
    }
}