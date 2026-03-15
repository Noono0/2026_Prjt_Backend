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
    private String birthYmd;
    private String email;
    private String gender;
    private String phone;
    private String region;
    private String roleCode;
    private String roleName;
    private String status;
    private String createDt;
    private String modifyDt;
    private String lastLoginAt;
}
