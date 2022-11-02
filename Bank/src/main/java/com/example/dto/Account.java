package com.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Account {
    private Long accountNumber;
    private String bankName;
    private String password;
    private String customerName;
}
