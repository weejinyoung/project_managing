package com.kimscompany.project_managing.domain.evaluation;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EvaluationContents {

    private String CommunicationGrade;
    private String CommunicationDetail;
    private String abilityGrade;
    private String abilityDetail;
}
