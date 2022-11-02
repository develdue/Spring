package com.example.Bussiness.policy;

import com.example.Bussiness.dto.Grade;
import com.example.Bussiness.dto.Member;


public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP) {
            return 1000;
        }
        return 0;
    }

}
