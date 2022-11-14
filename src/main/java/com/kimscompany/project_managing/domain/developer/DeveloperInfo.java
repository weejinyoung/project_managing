package com.kimscompany.project_managing.domain.developer;

import com.kimscompany.project_managing.domain.employee.Employee;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
public class DeveloperInfo {

    @Id @GeneratedValue
    @Column(name = "developer_info_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id")
    @NotNull
    private Employee developer;

    private String career;
    private String grade;
    private String skillSet;

    public DeveloperInfo updateDevInfo(String career, String grade, String skillSet) {
        this.career = career;
        this.grade = grade;
        this.skillSet = skillSet;
        return this;
    }

    public static DeveloperInfo createDevInfo(Employee developer) {
        DeveloperInfo devInfo = new DeveloperInfo();
        devInfo.setDeveloper(developer);
        devInfo.setCareer("미입력");
        devInfo.setGrade("미입력");
        devInfo.setSkillSet("미입력");
        return devInfo;
    }
}
