package com.Faris.Dao;

import com.Faris.Domain.ProjectFile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectFileDao {
    @Insert("INSERT INTO project_file(file_name)VALUES(#{file_name})")
    public void save(String file_name);
    @Select("SELECT * FROM project_file")
    public List<ProjectFile> findAll();
}
