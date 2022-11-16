package com.kimscompany.project_managing.domain.project;

import com.kimscompany.project_managing.domain.Period;
import com.kimscompany.project_managing.domain.Status;
import com.kimscompany.project_managing.domain.client.Client;
import com.kimscompany.project_managing.domain.developer.InputDev;
import com.kimscompany.project_managing.domain.evaluation.Evaluation;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
public class Project {

    @Id @GeneratedValue
    @Column(name = "project_id")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    @NotNull
    private Client client;

    @Embedded
    @NotNull
    private Period projectPeriod;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Status status;

    @OneToMany(mappedBy = "developer", cascade = CascadeType.ALL)
    private List<InputDev> inputDevs = new ArrayList<>();

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Evaluation> evaluations = new ArrayList<>();


    public static Project createProject(Client client, String name,
                                        Period projectPeriod) {
        Project project = new Project();
        project.setClient(client);
        project.setName(name);
        project.setProjectPeriod(projectPeriod);
        project.setStatus(Status.Ongoing);
        project.getClient().getProjects().add(project);
        return project;
    }
}
