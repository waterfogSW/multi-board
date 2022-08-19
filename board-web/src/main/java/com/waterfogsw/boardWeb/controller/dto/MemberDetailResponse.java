package com.waterfogsw.boardWeb.controller.dto;

import com.waterfogsw.boardCommon.member.entity.Member;

import lombok.Builder;

@Builder
public record MemberDetailResponse(
    String name,
    String email
) {

  public static MemberDetailResponse from(Member member) {
    return MemberDetailResponse
        .builder()
        .name(member.getName())
        .email(member.getEmail())
        .build();
  }
}
