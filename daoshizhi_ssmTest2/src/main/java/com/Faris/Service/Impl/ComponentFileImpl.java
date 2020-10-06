package com.Faris.Service.Impl;

import com.Faris.Dao.ComponentFIleDao;
import com.Faris.Domain.ComponentFile;
import com.Faris.Service.ComponentFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentFileImpl implements ComponentFileService {
    @Autowired
    private ComponentFIleDao componentFIleDao;
    @Override
    public void save(String file_name) {
        componentFIleDao.save(file_name);
    }

    @Override
    public List<ComponentFile> findAll() {
        return componentFIleDao.findAll();
    }
}
