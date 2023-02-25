package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.PurchaseQuotation;
import com.techvg.ima.domain.PurchaseQuotationDetails;
import com.techvg.ima.service.dto.PurchaseQuotationDTO;
import com.techvg.ima.service.dto.PurchaseQuotationDetailsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PurchaseQuotationDetails} and its DTO {@link PurchaseQuotationDetailsDTO}.
 */
@Mapper(componentModel = "spring")
public interface PurchaseQuotationDetailsMapper extends EntityMapper<PurchaseQuotationDetailsDTO, PurchaseQuotationDetails> {
    @Mapping(target = "purchaseQuotation", source = "purchaseQuotation", qualifiedByName = "purchaseQuotationId")
    PurchaseQuotationDetailsDTO toDto(PurchaseQuotationDetails s);

    @Named("purchaseQuotationId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PurchaseQuotationDTO toDtoPurchaseQuotationId(PurchaseQuotation purchaseQuotation);
}
