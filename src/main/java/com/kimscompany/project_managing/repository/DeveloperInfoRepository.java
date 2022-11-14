package com.kimscompany.project_managing.repository;

import com.kimscompany.project_managing.domain.developer.DeveloperInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperInfoRepository extends JpaRepository<DeveloperInfo, Long> {
}
