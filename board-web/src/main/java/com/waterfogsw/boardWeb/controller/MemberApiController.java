package com.waterfogsw.boardWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waterfogsw.boardCommon.member.entity.Member;
import com.waterfogsw.boardWeb.controller.dto.MemberDetailResponse;

@RestController
@RequestMapping("api/v1/members")
public class MemberApiController {

  @GetMapping("{id}")
  public MemberDetailResponse getDetail(
      @PathVariable
      long id
  ) {
    Member dummy = Member
        .builder()
        .name("waterfogSW")
        .email("waterfog9580@gmail.com")
        .build();

    return MemberDetailResponse.from(dummy);
  }

}
