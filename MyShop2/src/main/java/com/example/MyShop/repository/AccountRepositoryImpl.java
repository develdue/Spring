package com.example.MyShop.repository;

import com.example.MyShop.dto.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository{

    private static final Map<Long,Account> bank = new HashMap<>();

    @Override
    public void accountJoin(Account account) {
        String accountNumber = "";
        for(int num=0;num<13; num++){
            accountNumber += (long)(Math.random()*10);
        }
        account.setAccountNumber(accountNumber);
        account.setBalance(0);
        bank.put(account.getId(), account);
    }

    @Override
    public Account selectAccount(Long id) {
        return bank.get(id);
    }

    @Override
    public Account deleteAccount(Long id) {
        bank.remove(id);
       return bank.get(id);
    }

    @Override
    public Account updateAccount(Account account) {
        bank.replace(account.getId(), account);
        return bank.get(account.getId());
    }
}
