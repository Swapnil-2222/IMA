package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.SecurityUser;
import com.techvg.ima.domain.Transfer;
import com.techvg.ima.domain.TransferRecieved;
import com.techvg.ima.service.dto.SecurityUserDTO;
import com.techvg.ima.service.dto.TransferDTO;
import com.techvg.ima.service.dto.TransferRecievedDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link TransferRecieved} and its DTO {@link TransferRecievedDTO}.
 */
@Mapper(componentModel = "spring")
public interface TransferRecievedMapper extends EntityMapper<TransferRecievedDTO, TransferRecieved> {
    @Mapping(target = "securityUser", source = "securityUser", qualifiedByName = "securityUserLogin")
    @Mapping(target = "transfer", source = "transfer", qualifiedByName = "transferId")
    TransferRecievedDTO toDto(TransferRecieved s);

    @Named("securityUserLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    SecurityUserDTO toDtoSecurityUserLogin(SecurityUser securityUser);

    @Named("transferId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TransferDTO toDtoTransferId(Transfer transfer);
}
