package com.kimscompany.project_managing.service;

import com.kimscompany.project_managing.domain.employee.Employee;
import com.kimscompany.project_managing.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee signUp(Employee employee) {
        return employeeRepository.save(employee);
    }
}
