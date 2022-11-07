package com.example.MyShop.repository;

import com.example.MyShop.dto.Account;

public interface AccountRepository {

    void accountJoin(Account account);

    Account selectAccount(Long id);

}
