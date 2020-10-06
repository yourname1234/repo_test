package com.Faris.Service;

import com.Faris.Domain.ComponentFile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EquipmentFileService {
    @Insert("INSERT INTO equipment_file(file_name) VALUES(#{file_name})")
    public void save(String file_name);
    @Select("SELECT * FROM equipment_file")
    public List<ComponentFile> findAll();
}
