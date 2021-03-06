package com.cleanup.todoc.repositories;

import android.arch.lifecycle.LiveData;

import com.cleanup.todoc.database.dao.ProjectDao;
import com.cleanup.todoc.model.Project;

import java.util.List;

public class ProjectDataRepository {

    private final ProjectDao projectDao;

    public ProjectDataRepository(ProjectDao projectDao) { this.projectDao = projectDao; }



    // --- GET PROJECT ---
    public LiveData<Project> getProject(long id) { return this.projectDao.getProject(id); }

    public LiveData<List<Project>> getAllProjects() { return this.projectDao.getAllProjects(); }


}
