package com.example.Bussiness.repository;

import com.example.Bussiness.dto.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static final Map<Long, Member> store = new HashMap<>();

    @Override
    public void memberJoin(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    public Member selectMember(Long id) {
        return store;
    }
}
