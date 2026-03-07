package com.noonoo.prjtbackend.role.service;

import com.noonoo.prjtbackend.role.dto.RoleDto;

import java.util.List;


public interface RoleService {
    List<RoleDto> findAllActiveRoles();
}
