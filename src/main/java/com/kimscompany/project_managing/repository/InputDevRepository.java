package com.kimscompany.project_managing.repository;

import com.kimscompany.project_managing.domain.developer.DeveloperRole;
import com.kimscompany.project_managing.domain.developer.InputDev;
import com.kimscompany.project_managing.domain.employee.Employee;
import com.kimscompany.project_managing.domain.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InputDevRepository extends JpaRepository<InputDev, Long> {
    List<InputDev> findByDeveloper(Employee developer);
    List<InputDev> findByProject(Project project);
    List<InputDev> findByProjectAndRole(Project project, DeveloperRole role);
}
