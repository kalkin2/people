package com.example.people.member;


import com.example.people.member.entity.Member;
import com.example.people.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    private MemberService  memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }



    @PostMapping("/api/addMember")
    public void  addMember(@RequestBody Member member){
        System.out.println("member : "+member);
        memberService.addUser(member);
    }
}
