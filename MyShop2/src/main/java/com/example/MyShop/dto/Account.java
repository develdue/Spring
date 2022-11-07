package com.example.MyShop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@ToString
public class Account {
    private Long id;
    private Long customerId;
    private String customerPassword;
    private String address;
    private String accountNumber;
    private int balance;


}
