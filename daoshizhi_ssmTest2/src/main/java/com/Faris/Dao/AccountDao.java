package com.Faris.Dao;

import com.Faris.Domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //该注解用于将该接口添加到IOC容器，完成spring整合Mybatis
public interface AccountDao {
    //查询所有
    @Select("SELECT * FROM login")
    public List<Account> findAll();
    //根据用户名查询密码
    @Select("SELECT password FROM login WHERE username=#{username}")
    public String findByusername(Account account);
    @Insert("INSERT INTO login(username,password)VALUES(#{username},#{password})")
    //保存账户
    public void saveAccount(Account account);

}
