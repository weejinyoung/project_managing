package com.kimscompany.project_managing.service;

import com.kimscompany.project_managing.domain.project.Project;
import com.kimscompany.project_managing.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Project registerProject(Project project) {
        return projectRepository.save(project);
    }
}
