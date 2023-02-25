package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.Categories;
import com.techvg.ima.domain.Product;
import com.techvg.ima.domain.PurchaseQuotationDetails;
import com.techvg.ima.domain.SecurityUser;
import com.techvg.ima.domain.Unit;
import com.techvg.ima.service.dto.CategoriesDTO;
import com.techvg.ima.service.dto.ProductDTO;
import com.techvg.ima.service.dto.PurchaseQuotationDetailsDTO;
import com.techvg.ima.service.dto.SecurityUserDTO;
import com.techvg.ima.service.dto.UnitDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {
    @Mapping(target = "categories", source = "categories", qualifiedByName = "categoriesId")
    @Mapping(target = "unit", source = "unit", qualifiedByName = "unitId")
    @Mapping(target = "securityUser", source = "securityUser", qualifiedByName = "securityUserLogin")
    @Mapping(target = "purchaseQuotationDetails", source = "purchaseQuotationDetails", qualifiedByName = "purchaseQuotationDetailsId")
    ProductDTO toDto(Product s);

    @Named("categoriesId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CategoriesDTO toDtoCategoriesId(Categories categories);

    @Named("unitId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    UnitDTO toDtoUnitId(Unit unit);

    @Named("securityUserLogin")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "login", source = "login")
    SecurityUserDTO toDtoSecurityUserLogin(SecurityUser securityUser);

    @Named("purchaseQuotationDetailsId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PurchaseQuotationDetailsDTO toDtoPurchaseQuotationDetailsId(PurchaseQuotationDetails purchaseQuotationDetails);
}
