package com.kimscompany.project_managing.repository;

import com.kimscompany.project_managing.domain.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Employee findByName(String name);
}
