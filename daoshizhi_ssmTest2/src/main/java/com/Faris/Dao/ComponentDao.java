package com.Faris.Dao;

import com.Faris.Domain.Component;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ComponentDao {

    //根据器件名查询器件所有信息
    @Select("SELECT * FROM component WHERE name=#{name}")
    public Component searchByname(String name);
}
