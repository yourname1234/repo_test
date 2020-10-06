package com.Faris.Service.Impl;

import com.Faris.Dao.EquipmentDao;
import com.Faris.Domain.Component;
import com.Faris.Domain.Equipment;
import com.Faris.Service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "equipmentService")
public class EquipmentImpl implements EquipmentService {
    @Autowired
    private EquipmentDao equipmentDao;
    @Override
    public Equipment searchByname(String name) {
        return equipmentDao.searchByname(name);
    }
}
