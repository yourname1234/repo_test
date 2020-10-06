package com.Faris.Service.Impl;

import com.Faris.Dao.AccountDao;
import com.Faris.Domain.Account;
import com.Faris.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户");
        accountDao.saveAccount(account);
    }

    @Override
    public String findByusername(Account account) {

        String password= accountDao.findByusername(account);
        System.out.println("用户姓名："+account.getUsername());
        System.out.println("用户输入密码："+account.getPassword());
        System.out.println("数据库查询得到的密码："+password);
        return  password;
    }
}
