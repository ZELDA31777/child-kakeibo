package com.kakeibo.child_kakeibo.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kakeibo.child_kakeibo.entity.Member;
import com.kakeibo.child_kakeibo.repository.MemberRepository;


@RestController
// TODO : 추후에 React와의 연결을 생각하여 api로 시작.
@RequestMapping("/api/users")
public class MemberController {
    
    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member create(@RequestBody Member member) {
        return memberRepository.save(member);
    }
    
}
