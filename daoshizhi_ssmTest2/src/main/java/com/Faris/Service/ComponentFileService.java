package com.Faris.Service;

import com.Faris.Domain.ComponentFile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ComponentFileService {
    @Insert("INSERT INTO component_file(name) VALUES(#{file_name})")
    public void save(String file_name);
    @Select("SELECT * FROM component_file")
    public List<ComponentFile> findAll();
}
