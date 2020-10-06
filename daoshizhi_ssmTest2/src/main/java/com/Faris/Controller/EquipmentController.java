package com.Faris.Controller;

import com.Faris.Domain.Equipment;
import com.Faris.Service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/equipment")
public class EquipmentController {
    @Autowired
    private EquipmentService es;
    @RequestMapping(value = "/equipmentController")
    public @ResponseBody Equipment equipmentController(String name){
        return es.searchByname(name);
    }
}
