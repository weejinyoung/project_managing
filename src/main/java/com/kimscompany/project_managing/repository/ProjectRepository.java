package com.kimscompany.project_managing.repository;

import com.kimscompany.project_managing.domain.client.Client;
import com.kimscompany.project_managing.domain.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Project findByName(String name);
    List<Project> findByClient(Client client);
}
