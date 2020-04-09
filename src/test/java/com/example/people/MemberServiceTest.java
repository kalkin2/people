package com.example.people;

import com.example.people.member.entity.Member;
import com.example.people.member.repository.MemberRepository;
import com.example.people.member.service.MemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class MemberServiceTest {


    @Autowired
    private MemberServiceImpl memberService;

    @MockBean
    private MemberRepository memberRepository;


    //회원 가입 테스트
    @Test
    public void addUserTest(){
        Member member = Member.builder()
                .nickName("nickName")
                .email("kalkin2@naver.com")
                .address1("서울시 구로구 고척1동 ")
                .address2("3층")
                .age(34)
                .sex('M')
                .socialType(null)
                .build();

        when(memberRepository.save(member)).thenReturn(member);
        assertEquals(member,memberService.addUser(member));
    }


    //회원 조회 테스트



    //회원 삭제 테스트







}
