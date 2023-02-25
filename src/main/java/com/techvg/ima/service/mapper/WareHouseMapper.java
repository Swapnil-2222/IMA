package com.techvg.ima.service.mapper;

import com.techvg.ima.domain.WareHouse;
import com.techvg.ima.service.dto.WareHouseDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link WareHouse} and its DTO {@link WareHouseDTO}.
 */
@Mapper(componentModel = "spring")
public interface WareHouseMapper extends EntityMapper<WareHouseDTO, WareHouse> {}
