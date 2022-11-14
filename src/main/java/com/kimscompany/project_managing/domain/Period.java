package com.kimscompany.project_managing.domain;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Period {

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    public Date getPeriod() {
        return null;
    }
}
