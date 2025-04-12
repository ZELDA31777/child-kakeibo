package com.kakeibo.child_kakeibo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakeibo.child_kakeibo.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
    

}
