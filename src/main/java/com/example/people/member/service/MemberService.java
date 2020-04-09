package com.example.people.member.service;

import com.example.people.member.entity.Member;

import java.util.List;

public interface MemberService {


    public Member addUser(Member member);

    public List<Member> getAllMember(Member member);
}
