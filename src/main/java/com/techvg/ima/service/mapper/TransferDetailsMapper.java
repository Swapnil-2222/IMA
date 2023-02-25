package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.Product;
import com.techvg.ima.domain.Transfer;
import com.techvg.ima.domain.TransferDetails;
import com.techvg.ima.domain.WareHouse;
import com.techvg.ima.service.dto.ProductDTO;
import com.techvg.ima.service.dto.TransferDTO;
import com.techvg.ima.service.dto.TransferDetailsDTO;
import com.techvg.ima.service.dto.WareHouseDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link TransferDetails} and its DTO {@link TransferDetailsDTO}.
 */
@Mapper(componentModel = "spring")
public interface TransferDetailsMapper extends EntityMapper<TransferDetailsDTO, TransferDetails> {
    @Mapping(target = "wareHouse", source = "wareHouse", qualifiedByName = "wareHouseWhName")
    @Mapping(target = "product", source = "product", qualifiedByName = "productId")
    @Mapping(target = "transfer", source = "transfer", qualifiedByName = "transferId")
    TransferDetailsDTO toDto(TransferDetails s);

    @Named("wareHouseWhName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "whName", source = "whName")
    WareHouseDTO toDtoWareHouseWhName(WareHouse wareHouse);

    @Named("productId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProductDTO toDtoProductId(Product product);

    @Named("transferId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TransferDTO toDtoTransferId(Transfer transfer);
}
