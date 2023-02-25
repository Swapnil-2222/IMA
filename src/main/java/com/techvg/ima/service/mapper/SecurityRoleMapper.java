package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.SecurityPermission;
import com.techvg.ima.domain.SecurityRole;
import com.techvg.ima.service.dto.SecurityPermissionDTO;
import com.techvg.ima.service.dto.SecurityRoleDTO;
import java.util.Set;
import java.util.stream.Collectors;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link SecurityRole} and its DTO {@link SecurityRoleDTO}.
 */
@Mapper(componentModel = "spring")
public interface SecurityRoleMapper extends EntityMapper<SecurityRoleDTO, SecurityRole> {
    @Mapping(target = "securityPermissions", source = "securityPermissions", qualifiedByName = "securityPermissionNameSet")
    SecurityRoleDTO toDto(SecurityRole s);

    @Mapping(target = "removeSecurityPermission", ignore = true)
    SecurityRole toEntity(SecurityRoleDTO securityRoleDTO);

    @Named("securityPermissionName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    SecurityPermissionDTO toDtoSecurityPermissionName(SecurityPermission securityPermission);

    @Named("securityPermissionNameSet")
    default Set<SecurityPermissionDTO> toDtoSecurityPermissionNameSet(Set<SecurityPermission> securityPermission) {
        return securityPermission.stream().map(this::toDtoSecurityPermissionName).collect(Collectors.toSet());
    }
}
