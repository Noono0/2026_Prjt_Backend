package com.noonoo.prjtbackend.role.mapper;

import java.util.List;

import com.noonoo.prjtbackend.role.dto.RoleDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RoleMapper {
    List<RoleDto> findAllActiveRoles();
}
