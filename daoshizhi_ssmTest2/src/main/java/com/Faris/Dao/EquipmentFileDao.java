package com.Faris.Dao;

import com.Faris.Domain.ComponentFile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentFileDao {
    @Insert("INSERT INTO equipment_file(file_name) VALUES(#{file_name})")
    public void save(String file_name);
    @Select("SELECT * FROM equipment_file")
    public List<ComponentFile> findAll();
}
