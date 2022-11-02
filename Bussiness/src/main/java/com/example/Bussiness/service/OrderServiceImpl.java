package com.example.Bussiness.service;

import com.example.Bussiness.dto.Member;
import com.example.Bussiness.dto.Order;
import com.example.Bussiness.policy.DiscountPolicy;
import com.example.Bussiness.policy.FixDiscountPolicy;
import com.example.Bussiness.repository.MemberRepository;
import com.example.Bussiness.repository.MemoryMemberRepository;


public class OrderServiceImpl implements OrderService {

    MemberRepository memberRepository = new MemoryMemberRepository();
    DiscountPolicy discountPolicy = new FixDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.selectMember(memberId);//memberid를 가져온다
        int discountPrice = discountPolicy.discount(member, itemPrice);//등급하고 가격을 가져와서 할인된 가격을 discountPrice에 넣는다

        Order order = new Order(); //Order객체 생성
        order.setMemberId(member.getId());//Order테이블에 멤버 id 저장
        order.setItemName(itemName);//Order테이블에 상품 이름 저장
        order.setItemPrice(itemPrice);//Orde테이블에 가격저장
        order.setDiscountPrice(discountPrice);//Order테이블에 setDiscountPrice변수에 할인된 가격 저장.

        return order; //order를 반환.
    }
}