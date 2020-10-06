package com.Faris.Service;

import com.Faris.Domain.Component;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;


public interface ComponentService {
    //根据器件名查询器件所有信息
    @Select("SELECT * FROM component WHERE name=#{name}")
    public Component searchByname(String name);
}
