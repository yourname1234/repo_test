package com.Faris.Service.Impl;

import com.Faris.Dao.ComponentDao;
import com.Faris.Domain.Component;
import com.Faris.Service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "ComponentService")
public class ComponentServiceImpl implements ComponentService {
    @Autowired
    private ComponentDao componentDao;
    @Override
    public Component searchByname(String name) {
       Component component= componentDao.searchByname(name);
        System.out.println("searchByname成功执行！");
        return component;
    }
}
