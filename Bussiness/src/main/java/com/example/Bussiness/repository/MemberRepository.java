package com.example.Bussiness.repository;

import com.example.Bussiness.dto.Member;

public interface MemberRepository {

    void memberJoin(Member member);

    Member selectMember(Long id);
}
