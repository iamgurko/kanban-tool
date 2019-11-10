package com.example.kanban.services;

import com.example.kanban.domain.Project;
import com.example.kanban.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    public Project saveOrUpdateProject(Project project){
        return projectRepository.save(project);
    }
}
