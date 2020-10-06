package com.Faris.Service;

import com.Faris.Domain.Component;
import com.Faris.Domain.Equipment;
import org.apache.ibatis.annotations.Select;

public interface EquipmentService {
    //根据器件名查询器件所有信息
    @Select("SELECT * FROM equipment WHERE name=#{name}")
    public Equipment searchByname(String name);
}
