package com.example.Bussiness.service;

import com.example.Bussiness.dto.Member;
import com.example.Bussiness.dto.Order;

public interface OrderService {

    public Order createOrder(Long memberId, String itemName, int itemPrice);


}
