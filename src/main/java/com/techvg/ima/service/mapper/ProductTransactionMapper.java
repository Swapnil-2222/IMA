package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.ProductTransaction;
import com.techvg.ima.domain.SecurityUser;
import com.techvg.ima.domain.WareHouse;
import com.techvg.ima.service.dto.ProductTransactionDTO;
import com.techvg.ima.service.dto.SecurityUserDTO;
import com.techvg.ima.service.dto.WareHouseDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProductTransaction} and its DTO {@link ProductTransactionDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductTransactionMapper extends EntityMapper<ProductTransactionDTO, ProductTransaction> {
    @Mapping(target = "securityUser", source = "securityUser", qualifiedByName = "securityUserLogin")
    @Mapping(target = "wareHouse", source = "wareHouse", qualifiedByName = "wareHouseWhName")
    ProductTransactionDTO toDto(ProductTransaction s);

    @Named("securityUserLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    SecurityUserDTO toDtoSecurityUserLogin(SecurityUser securityUser);

    @Named("wareHouseWhName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "whName", source = "whName")
    WareHouseDTO toDtoWareHouseWhName(WareHouse wareHouse);
}
