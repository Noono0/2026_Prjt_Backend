package com.noonoo.prjtbackend.role.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDto {
    private Long roleId;
    private String roleName;
    private String roleCode;
    private String useYn;
}
