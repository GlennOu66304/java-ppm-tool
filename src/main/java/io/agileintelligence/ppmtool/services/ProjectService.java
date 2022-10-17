package io.agileintelligence.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.agileintelligence.ppmtool.domain.Project;
// import io.agileintelligence.ppmtool.exception.ProjectException;
import io.agileintelligence.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
    @Autowired
    private static ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        // try {
        //     project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
        //     return projectRepository.save(project);
        // } catch (Exception e) {

        //     throw new ProjectException(
        //             "Project Id '" + project.getProjectIdentifier().toUpperCase() + "'  Already exist ");
        // }
        
        return projectRepository.save(project);
    }

    public static Project findProjectByProjectIdentifier(String projectId) {
        return projectRepository.findByProjectIdentifier(projectId);
    }
}
