package com.waterfogsw.boardCommon.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waterfogsw.boardCommon.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
