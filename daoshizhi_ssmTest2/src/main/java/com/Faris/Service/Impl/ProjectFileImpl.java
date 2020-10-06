package com.Faris.Service.Impl;

import com.Faris.Dao.ProjectFileDao;
import com.Faris.Domain.ProjectFile;
import com.Faris.Service.ProjectFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ProjectFileService")
public class ProjectFileImpl implements ProjectFileService {
    @Autowired
    private ProjectFileDao projectFileDao;
    @Override
    public void save(String name) {
        projectFileDao.save(name);
    }

    @Override
    public List<ProjectFile> findAll() {

        return projectFileDao.findAll();
    }
}
