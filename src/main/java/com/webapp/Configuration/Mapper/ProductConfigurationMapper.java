package com.webapp.Configuration.Mapper;

import com.webapp.DTO.Product.ProductConfigurationDTO;
import com.webapp.Model.Product.ProductConfiguration;
import com.webapp.Model.Product.ProductConfigurationId;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductConfigurationMapper {
    ProductConfigurationDTO toDTO(ProductConfigurationId productConfigId);

    ProductConfiguration toEntity(ProductConfigurationDTO productConfigDTO);
}
