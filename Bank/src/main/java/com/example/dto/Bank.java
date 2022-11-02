package com.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Bank {

    private String customerName;
    private String customerPassword;
    private BankKind bankKind;
}
