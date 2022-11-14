package com.kimscompany.project_managing.domain.employee;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
public class Employee {

    @Id @GeneratedValue//(generator = IdGenerator.GENERATOR_NAME)
    //@GenericGenerator(name = IdGenerator.generatorName, strategy = "a.b.c.MyGenerator")
    @Column(name = "employee_id")
    private Long id;

    private String name;
    private String socialId;
    private String education;
    private String webId;
    private String webPassword;

    @Enumerated(EnumType.STRING)
    @NotNull
    private EmployeeTeam team;

    public static Employee createEmployee(String name, String socialId,
                                          String education, String webId,
                                          String webPassword, EmployeeTeam team) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setSocialId(socialId);
        employee.setEducation(education);
        employee.setWebId(webId);
        employee.setWebPassword(webPassword);
        employee.setTeam(team);
        return employee;
    }
}
