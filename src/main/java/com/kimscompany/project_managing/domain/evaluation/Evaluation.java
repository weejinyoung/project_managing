package com.kimscompany.project_managing.domain.evaluation;

import com.kimscompany.project_managing.domain.employee.Employee;
import com.kimscompany.project_managing.domain.project.Project;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
public class Evaluation {

    @Id @GeneratedValue
    @Column(name = "evaluation_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    @NotNull
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "employee_id", name = "evaluator_id")
    @NotNull
    private Employee evaluator;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName =  "employee_id", name = "evaluated_id")
    @NotNull
    private Employee evaluated;

    @Enumerated(EnumType.STRING)
    @NotNull
    private EvaluationType type;

    @Embedded
    @NotNull
    private EvaluationContents contents;


    public static Evaluation createEvaluation(Project project, Employee evaluator,
                                              Employee evaluated, EvaluationContents contents,
                                              EvaluationType type) {
        Evaluation evaluation = new Evaluation();
        evaluation.setProject(project);
        evaluation.setEvaluator(evaluator);
        evaluation.setEvaluated(evaluated);
        evaluation.setContents(contents);
        evaluation.setType(type);
        evaluation.getProject().getEvaluations().add(evaluation);
        return evaluation;
    }
}
