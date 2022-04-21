package com.gooushy.wiki.controller;

import com.gooushy.wiki.domain.Account;
import com.gooushy.wiki.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/findAll")
    public List<Account> findAll(){
        return accountService.findAll();
    }
}
