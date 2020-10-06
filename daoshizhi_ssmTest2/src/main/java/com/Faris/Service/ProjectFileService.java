package com.Faris.Service;

import com.Faris.Domain.ProjectFile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProjectFileService {
    @Insert("INSERT INTO project_file(name)VALUES(#{file_name})")
    public void save(String file_name);
    @Select("SELECT * FROM project_file")
    public List<ProjectFile> findAll();
}
