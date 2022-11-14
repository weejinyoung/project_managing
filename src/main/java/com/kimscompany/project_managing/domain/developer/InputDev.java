package com.kimscompany.project_managing.domain.developer;

import com.kimscompany.project_managing.domain.Period;
import com.kimscompany.project_managing.domain.Status;
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
public class InputDev {

    @Id
    @GeneratedValue
    @Column(name = "input_dev_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    @NotNull
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id")
    @NotNull
    private Employee developer;

    @Enumerated(EnumType.STRING)
    @NotNull
    private DeveloperRole role;

    @Embedded
    @NotNull
    private Period devPeriod;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Status status;

    public static InputDev createInputDev(Project project, Employee developer,
                                            DeveloperRole role, Period devPeriod) {
        InputDev inputDev = new InputDev();
        inputDev.setProject(project);
        inputDev.setDeveloper(developer);
        inputDev.setRole(role);
        inputDev.setDevPeriod(devPeriod);
        inputDev.setStatus(Status.Ongoing);
        inputDev.getProject().getInputDevs().add(inputDev);
        return inputDev;
    }
}
