package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.GoodsRecived;
import com.techvg.ima.domain.PurchaseQuotation;
import com.techvg.ima.service.dto.GoodsRecivedDTO;
import com.techvg.ima.service.dto.PurchaseQuotationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link GoodsRecived} and its DTO {@link GoodsRecivedDTO}.
 */
@Mapper(componentModel = "spring")
public interface GoodsRecivedMapper extends EntityMapper<GoodsRecivedDTO, GoodsRecived> {
    @Mapping(target = "purchaseQuotation", source = "purchaseQuotation", qualifiedByName = "purchaseQuotationId")
    GoodsRecivedDTO toDto(GoodsRecived s);

    @Named("purchaseQuotationId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PurchaseQuotationDTO toDtoPurchaseQuotationId(PurchaseQuotation purchaseQuotation);
}
