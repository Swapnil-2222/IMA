package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.SecurityPermission;
import com.techvg.ima.service.dto.SecurityPermissionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link SecurityPermission} and its DTO {@link SecurityPermissionDTO}.
 */
@Mapper(componentModel = "spring")
public interface SecurityPermissionMapper extends EntityMapper<SecurityPermissionDTO, SecurityPermission> {}
