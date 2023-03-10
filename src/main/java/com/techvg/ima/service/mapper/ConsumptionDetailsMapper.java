package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.ConsumptionDetails;
import com.techvg.ima.domain.ProductInventory;
import com.techvg.ima.domain.Project;
import com.techvg.ima.domain.SecurityUser;
import com.techvg.ima.service.dto.ConsumptionDetailsDTO;
import com.techvg.ima.service.dto.ProductInventoryDTO;
import com.techvg.ima.service.dto.ProjectDTO;
import com.techvg.ima.service.dto.SecurityUserDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ConsumptionDetails} and its DTO {@link ConsumptionDetailsDTO}.
 */
@Mapper(componentModel = "spring")
public interface ConsumptionDetailsMapper extends EntityMapper<ConsumptionDetailsDTO, ConsumptionDetails> {
    @Mapping(target = "securityUser", source = "securityUser", qualifiedByName = "securityUserLogin")
    @Mapping(target = "project", source = "project", qualifiedByName = "projectName")
    @Mapping(target = "productInventory", source = "productInventory", qualifiedByName = "productInventoryId")
    ConsumptionDetailsDTO toDto(ConsumptionDetails s);

    @Named("securityUserLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    SecurityUserDTO toDtoSecurityUserLogin(SecurityUser securityUser);

    @Named("projectName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    ProjectDTO toDtoProjectName(Project project);

    @Named("productInventoryId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProductInventoryDTO toDtoProductInventoryId(ProductInventory productInventory);
}
