package com.kimscompany.project_managing.repository;

import com.kimscompany.project_managing.domain.employee.Employee;
import com.kimscompany.project_managing.domain.evaluation.Evaluation;
import com.kimscompany.project_managing.domain.evaluation.EvaluationType;
import com.kimscompany.project_managing.domain.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
    List<Evaluation> findByProject(Project project);
    List<Evaluation> findByEvaluator(Employee evaluator);
    List<Evaluation> findByEvaluated(Employee evaluated);
    List<Evaluation> findByType(EvaluationType type);
}
