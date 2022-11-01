package com.example.Bussiness.dto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;
}
