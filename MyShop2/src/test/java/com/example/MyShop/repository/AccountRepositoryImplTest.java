package com.example.MyShop.repository;

import com.example.MyShop.dto.Account;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryImplTest {

    CustomerRepository customerRepository = new CustomerRepositoryImpl();//회원가입에 필요한 객체가 필요하기에 객체 생성
    AccountRepository accountRepository = new AccountRepositoryImpl();

    @Test
    void accountJoin(){
        Account account = new Account(5465L, 123465L, "TJWODUS12", "탄현", "54654654", 465465);
        accountRepository.accountJoin(account);

        Account account1 = account;

        assertThat(account).isEqualTo(account1);  //assertThat을 사용하여 처음 소괄호에는 실제 집어넣은 값, 이후 isEqualTo에는 다른 그릇에 집어넣은 변수 입력
        System.out.println(account1); //toString을 사용했다면 메모리단에 어떻게 저장되어 있는지 열람 가능.
    }

    @Test
    void selectAccount() {
        Account account = new Account(5465L, 123465L, "TJWODUS12", "탄현", "54654654", 465465);
        accountRepository.accountJoin(account);
        Account account1 = accountRepository.selectAccount(5465L);
        System.out.println(account1);

    }

    @Test
    void deleteAccount(){
        Account account = new Account(5465L, 123465L, "TJWODUS12", "탄현", "54654654", 465465);
        accountRepository.accountJoin(account);
        System.out.println(account);
        Account account1 = accountRepository.deleteAccount(5465L);
        Account account2 = accountRepository.selectAccount(5465L);
        System.out.println(account1);
        System.out.println(account2);
    }

    @Test
    void updateAccount(){
        Account account = new Account(5465L, 123465L, "TJWODUS12", "탄현", "54654654", 465465);
        accountRepository.accountJoin(account);
        account.setAddress("일산");
        Account account1 = accountRepository.updateAccount(account);
        System.out.println(account1);

        assertThat(account1).isEqualTo(account);

    }
}