package com.Faris.Dao;

import com.Faris.Domain.Component;
import com.Faris.Domain.Equipment;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentDao {
    //根据器件名查询器件所有信息
    @Select("SELECT * FROM equipment WHERE name=#{name}")
    public Equipment searchByname(String name);
}
