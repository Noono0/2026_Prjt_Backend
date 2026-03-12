package com.noonoo.prjtbackend.member.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberSearchCondition {
    private String memberId;
    private String memberName;
    private String roleCode;
    private String status;
}
