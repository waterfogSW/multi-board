package com.waterfogsw.boardApi.service;

import org.springframework.stereotype.Service;

import com.waterfogsw.boardCommon.member.entity.Member;
import com.waterfogsw.boardCommon.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberDefaultService implements MemberService {

  private final MemberRepository memberRepository;

  @Override
  public long signUp(Member member) {
    return memberRepository
        .save(member)
        .getId();
  }

}
