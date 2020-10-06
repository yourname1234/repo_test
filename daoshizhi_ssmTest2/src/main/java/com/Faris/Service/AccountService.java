package com.Faris.Service;

import com.Faris.Domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<Account> findAll();
    //保存账户
    public void saveAccount(Account account);
    //根据用户名查询密码
    public String findByusername(Account account);
}
