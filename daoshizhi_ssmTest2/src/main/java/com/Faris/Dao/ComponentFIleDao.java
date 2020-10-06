package com.Faris.Dao;

import com.Faris.Domain.ComponentFile;
import com.Faris.Domain.EquipmentFile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface ComponentFIleDao {
    @Insert("INSERT INTO component_file(file_name) VALUES(#{file_name})")
    public void save(String file_name);
    @Select("SELECT * FROM component_file")
    public List<ComponentFile> findAll();
}
