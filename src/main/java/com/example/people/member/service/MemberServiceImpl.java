package com.example.people.member.service;

import com.example.people.member.entity.Member;
import com.example.people.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MemberServiceImpl implements MemberService{


    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public List<Member> getAllMember(Member member) {
        return memberRepository.findAll();
    }
    @Override
    public Member addUser(Member member) {
        return memberRepository.save(member);
    }
}
