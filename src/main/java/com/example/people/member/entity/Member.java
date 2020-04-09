package com.example.people.member.entity;


import lombok.*;
import org.springframework.util.Assert;

import javax.persistence.*;

/**
 * Memeber Entity
 */

@Data
@Entity(name="member")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="member")

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_seq")
    private long memberSeq;

    @Column(name = "email")
    private String email;

    @Column(name = "social_type")
    private String socialType;

    @Column(name="nick_name")
    private String nickName;

    @Column(name="age")
    private int age;

    @Column(name="sex")
    private char sex;

    @Column(name="address1")
    private String address1;

    @Column(name="address2")
    private String address2;


    @Builder
    public Member(String email, String nickName, String socialType, int age, char sex, String address1, String address2) {
        Assert.hasText(email, "email must not be empty");
        Assert.hasText(nickName, "nickName must not be empty");
        this.email = email;
        this.nickName = nickName;
        this.socialType = socialType;
        this.age = age;
        this.sex = sex;
        this.address1 = address1;
        this.address2 =address2;
    }



}
