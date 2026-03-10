package com.noonoo.prjtbackend.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDto {
    private Long memberSeq;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String email;
    private String roleCode;
}
