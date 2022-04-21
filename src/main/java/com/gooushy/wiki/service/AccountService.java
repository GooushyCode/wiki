package com.gooushy.wiki.service;

import com.gooushy.wiki.domain.Account;
import com.gooushy.wiki.mapper.AccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {

    @Resource
    private AccountMapper accountMapper;

    public List<Account> findAll(){
        return accountMapper.findAll();
    }
}
