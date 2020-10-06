package com.Faris.Service.Impl;

import com.Faris.Dao.EquipmentFileDao;
import com.Faris.Domain.ComponentFile;
import com.Faris.Service.EquipmentFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentFileImpl implements EquipmentFileService {
    @Autowired
    private EquipmentFileDao equipmentFileDao;
    @Override
    public void save(String file_name) {
        equipmentFileDao.save(file_name);
    }

    @Override
    public List<ComponentFile> findAll() {
        return equipmentFileDao.findAll();
    }
}
