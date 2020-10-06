package com.Faris.Controller;

import com.Faris.Domain.Account;
import com.Faris.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.util.List;
import java.util.Objects;

//Web层
@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountService as;
    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户....");
        List<Account> accounts =as.findAll();
        model.addAttribute("list",accounts);
        return "list";
    }
    @RequestMapping(value = "/saveAccount")
    public void saveAccount( Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
//        System.out.println("表现层：保存账户....");
        as.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/index.jsp");

    }
    @RequestMapping(value = "/findByusername")
    public @ResponseBody Boolean findByusername(@RequestBody Account account){
        System.out.println("controller:"+account);
        String password=as.findByusername(account);
        if(Objects.equals(password, account.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}
