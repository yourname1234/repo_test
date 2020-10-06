package com.Faris.Test;

import com.Faris.Service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService= (AccountService) ac.getBean("accountService");
        accountService.findAll();
    }
}
