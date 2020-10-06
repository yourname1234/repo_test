package com.Faris.Controller;

import com.Faris.Domain.Component;
import com.Faris.Service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Component")
public class ComponentController {
    @Autowired
    private ComponentService cs;
    @RequestMapping(value = "/ComponentController")
    public @ResponseBody Component ComponentController(String name){
        System.out.println("成功执行controller方法");
        Component data= cs.searchByname(name);
        System.out.println(data);
        return data;
    }
}
