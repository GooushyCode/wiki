package com.gooushy.wiki.mapper;

import com.gooushy.wiki.domain.Account;

import java.util.List;

public interface AccountMapper {
    List<Account> findAll();
}
