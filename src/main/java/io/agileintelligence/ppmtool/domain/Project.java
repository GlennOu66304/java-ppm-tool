package io.agileintelligence.ppmtool.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date start_date;
    private Date end_date;
    private Date created_At;
    private Date updated_At;

    public Project() {

    }

    // id
    public Long getId() {
        return id;

    }

    public void setId(long id) {
        this.id = id;

    }

    // projectName
    public String getProjectName() {
        return projectName;

    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;

    }

    // description
    public String getDescription() {
        return description;

    }

    public void setDescripion(String description) {
        this.description = description;

    }

    @PrePersist
    protected void onCreate() {
        this.created_At = new Date();

    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_At = new Date();
    }
}
