package com.Faris.Test;

import com.Faris.Dao.AccountDao;
import com.Faris.Domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    InputStream in;
    SqlSessionFactory factory;
    SqlSession session;
    AccountDao accountDao;
    @Before
    public void init() throws Exception {
        //1.读取配置文件
        in= Resources.getResourceAsStream("SqlMapConfig.xml");  //注意导入的resources必须是org.apache.ibatis.io包内的
        //创建SqlSessionFaction工厂
        factory = new SqlSessionFactoryBuilder().build(in);
        //3.使用SqlSessionFatory生产Session对象
        session=factory.openSession();
        //4.使用SqlSession创建Dao接口的动态代理对象
        accountDao=session.getMapper(AccountDao.class);
    }
    @After
    public void destory() throws IOException {
        //释放资源
        session.commit();   //查询不需要提交事务，但增、删、改必须提交事务
        session.close();
        in.close();
    }

    @Test
        public void testfindAll(){
        List<Account>Accounts=accountDao.findAll();
        for (Account account:Accounts) {
            System.out.println(account);
        }
    }
    @Test
        public void testSaveAccount(){
        Account account = new Account();
        account.setUsername("Faris");
        account.setPassword("yfc4015");
        accountDao.saveAccount(account);
    }
}
