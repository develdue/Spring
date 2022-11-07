package com.example.MyShop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@ToString
public class Customer {
    private String name;
    private String rrNumber;
    private String address;
    private String password;
    private String accountNumber;
    private int balance;
    private Bank bank;

}
