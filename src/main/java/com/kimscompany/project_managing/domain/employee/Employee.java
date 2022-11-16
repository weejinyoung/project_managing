package com.kimscompany.project_managing.domain.employee;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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
    @NotBlank(message = "ID를 입력해주세요")
    private String webId;
    @NotBlank(message = "Password를 입력해주세요")
    private String webPassword;

    @Enumerated(EnumType.STRING)
    @NotNull
    private JobGroup jobGroup;

    public static Employee createEmployee(String name, String socialId,
                                          String education, String webId,
                                          String webPassword, JobGroup jobGroup) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setSocialId(socialId);
        employee.setEducation(education);
        employee.setWebId(webId);
        employee.setWebPassword(webPassword);
        employee.setJobGroup(jobGroup);
        return employee;
    }
}
