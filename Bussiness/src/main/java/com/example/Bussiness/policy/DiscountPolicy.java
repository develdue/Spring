package com.example.Bussiness.policy;

import com.example.Bussiness.dto.Member;
import com.example.Bussiness.dto.Order;

public interface DiscountPolicy {
    int discount(Member member, int itemPrice);

}
