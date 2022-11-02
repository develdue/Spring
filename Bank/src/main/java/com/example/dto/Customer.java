package com.example.dto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Customer {
    private String name;
    private String accountNumber;
    private String bankName;
    private AccountKind accountkind;
    private String rrNumber;
    private String address;

}
